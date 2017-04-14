package com.huy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.huy.domain.DonDangKyKetHon;
import com.huy.service.DonDangKyKetHonService;

@Controller
public class DonDangKyKetHonController {
	
	@Autowired
	private DonDangKyKetHonService dondangkykethonService;

    @GetMapping("/dondangkykethon")
    public String index(Model model) {
        model.addAttribute("dondangkykethons", dondangkykethonService.findAll());
        return "dondangkykethon_list";
    }
    
    @GetMapping("/dondangkykethon/create")
    public String create(Model model) {
        model.addAttribute("dondangkykethon", new DonDangKyKetHon());
        return "dondangkykethon_form";
    }
    
    @GetMapping("/dondangkykethon/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("dondangkykethon", dondangkykethonService.findOne(id));
        return "dondangkykethon_form";
    }
    
    @PostMapping("/dondangkykethon/save")
    public String save(@Valid DonDangKyKetHon dondangkykethon, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "dondangkykethon_form";
        }
        dondangkykethonService.save(dondangkykethon);
        redirect.addFlashAttribute("success", "Saved dondangkykethon successfully!");
        return "redirect:/dondangkykethon";
    }
    
    @GetMapping("/dondangkykethon/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
    	dondangkykethonService.delete(id);
        redirect.addFlashAttribute("success", "Deleted dondangkykethon successfully!");
        return "redirect:/dondangkykethon";
     }
    
    @GetMapping("/dondangkykethon/search")
    public String search(@RequestParam("q") String q, Model model) {
        if (q.equals("")) {
            return "redirect:/dondangkykethon";
        }
        
        model.addAttribute("dondangkykethons", dondangkykethonService.search(q));
        return "dondangkykethon_list";
    }

}
