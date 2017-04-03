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

import com.huy.domain.KetHon;
import com.huy.service.KetHonService;

@Controller
public class KetHonController {
	
	@Autowired
	private KetHonService kethonService;

    @GetMapping("/kethon")
    public String index(Model model) {
        model.addAttribute("kethons", kethonService.findAll());
        return "list";
    }
    
    @GetMapping("/kethon/create")
    public String create(Model model) {
        model.addAttribute("kethon", new KetHon());
        return "form";
    }
    
    @GetMapping("/kethon/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("kethon", kethonService.findOne(id));
        return "form";
    }
    
    @PostMapping("/kethon/save")
    public String save(@Valid KetHon kethon, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "form";
        }
        kethonService.save(kethon);
        redirect.addFlashAttribute("success", "Saved kethon successfully!");
        return "redirect:/kethon";
    }
    
    @GetMapping("/kethon/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
    	kethonService.delete(id);
        redirect.addFlashAttribute("success", "Deleted kethon successfully!");
        return "redirect:/kethon";
     }
    
    @GetMapping("/kethon/search")
    public String search(@RequestParam("q") String q, Model model) {
        if (q.equals("")) {
            return "redirect:/kethon";
        }
        
        model.addAttribute("kethons", kethonService.search(q));
        return "list";
    }

}
