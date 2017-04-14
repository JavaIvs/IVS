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

import com.huy.domain.HonNhan;
import com.huy.service.HonNhanService;

@Controller
public class HonNhanController {
	
	@Autowired
	private HonNhanService honnhanService;

    @GetMapping("/honnhan")
    public String index(Model model) {
        model.addAttribute("honnhans", honnhanService.findAll());
        return "honnhan_list";
    }
    
    @GetMapping("/honnhan/create")
    public String create(Model model) {
        model.addAttribute("honnhan", new HonNhan());
        return "honnhan_form";
    }
    
    @GetMapping("/honnhan/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("honnhan", honnhanService.findOne(id));
        return "honnhan_form";
    }
    
    @GetMapping("/honnhan/xacminh/{id}/edit")
    public String xacminh(@PathVariable int id, Model model) {
        model.addAttribute("honnhan", honnhanService.findOne(id));
        return "xacminh";
    }
    
    @GetMapping("/honnhan/duyet/{id}/edit")
    public String duyet(@PathVariable int id, Model model) {
        model.addAttribute("honnhan", honnhanService.findOne(id));
        return "duyet";
    }
    
    @PostMapping("/honnhan/save")
    public String save(@Valid HonNhan honnhan, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "honnhan_form";
        }
        honnhanService.save(honnhan);
        redirect.addFlashAttribute("success", "Saved honnhan successfully!");
        return "redirect:/honnhan";
    }
    
    @GetMapping("/honnhan/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
    	honnhanService.delete(id);
        redirect.addFlashAttribute("success", "Deleted honnhan successfully!");
        return "redirect:/honnhan";
     }
    
    @GetMapping("/honnhan/search")
    public String search(@RequestParam("q") String q, Model model) {
        if (q.equals("")) {
            return "redirect:/honnhan";
        }
        
        model.addAttribute("honnhans", honnhanService.search(q));
        return "honnhan_list";
    }

}
