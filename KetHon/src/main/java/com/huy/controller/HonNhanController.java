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
import com.huy.domain.Xa;
import com.huy.service.XaService;
import com.huy.domain.DanToc;
import com.huy.service.DanTocService;
import com.huy.domain.QuocTich;
import com.huy.service.QuocTichService;
@Controller
public class HonNhanController {
	
	@Autowired
	private HonNhanService honnhanService;
	
	@Autowired
	private XaService xaService;
	
	@Autowired
	private DanTocService dantocService;
	
	@Autowired
	private QuocTichService quoctichService;
	
    @GetMapping("/honnhan")
    public String index(Model model) {
        model.addAttribute("honnhans", honnhanService.findAll());
        model.addAttribute("xas", xaService.findAll());
        model.addAttribute("dantocs", dantocService.findAll());
        model.addAttribute("quoctichs", quoctichService.findAll());
        return "honnhan_list";
    }
    
    @GetMapping("/honnhan/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("honnhan", honnhanService.findOne(id));
        model.addAttribute("xas", xaService.findAll());
        model.addAttribute("dantocs", dantocService.findAll());
        model.addAttribute("quoctichs", quoctichService.findAll());
        return "honnhan_form";
    }
    // Đăng kí kết hôn
    @GetMapping("/dangkykethon")
    public String dangkykethon(Model model) {
        model.addAttribute("honnhan", new HonNhan());
        model.addAttribute("xas", xaService.findAll());
        model.addAttribute("dantocs", dantocService.findAll());
        model.addAttribute("quoctichs", quoctichService.findAll());
        return "honnhan_form";
    }
    
    //Danh sách
    @GetMapping("/chuaxacminhlist")
    public String chuaxacminh(Model model) {
        model.addAttribute("honnhans", honnhanService.phanloai("chuaxacminh"));
        model.addAttribute("xas", xaService.findAll());
        model.addAttribute("dantocs", dantocService.findAll());
        model.addAttribute("quoctichs", quoctichService.findAll());
        model.addAttribute("honnhan", new HonNhan());
        return "chuaxacminh_list";
    }
    
    @GetMapping("/daxacminhlist")
    public String daxacminh(Model model) {
        model.addAttribute("honnhans", honnhanService.phanloai("daxacminh"));
        model.addAttribute("xas", xaService.findAll());
        model.addAttribute("dantocs", dantocService.findAll());
        model.addAttribute("quoctichs", quoctichService.findAll());
        model.addAttribute("honnhan", new HonNhan());
        return "daxacminh_list";
    }
    
    @GetMapping("/daduyetlist")
    public String daduyet(Model model) {
        model.addAttribute("honnhans", honnhanService.phanloai("daduyet"));
        model.addAttribute("xas", xaService.findAll());
        model.addAttribute("dantocs", dantocService.findAll());
        model.addAttribute("quoctichs", quoctichService.findAll());
        return "daduyet_list";
    }
    
    //Chức năng theo loại
    @GetMapping("/honnhan/xacminh/{id}/edit")
    public String xacminh(@PathVariable int id, Model model) {
        model.addAttribute("honnhan", honnhanService.findOne(id));
        model.addAttribute("xas", xaService.findAll());
        model.addAttribute("dantocs", dantocService.findAll());
        model.addAttribute("quoctichs", quoctichService.findAll());
        return "xacminh";
    }
    
    @GetMapping("/honnhan/duyet/{id}/edit")
    public String duyet(@PathVariable int id, Model model) {
        model.addAttribute("honnhan", honnhanService.findOne(id));
        model.addAttribute("xas", xaService.findAll());
        model.addAttribute("dantocs", dantocService.findAll());
        model.addAttribute("quoctichs", quoctichService.findAll());
        return "duyet";
    }
    
    // Lưu theo loại
    @PostMapping("/honnhan/save")
    public String save(@Valid HonNhan honnhan, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "honnhan_form";
        }
        honnhanService.save(honnhan);
        redirect.addFlashAttribute("success", "Đã lưu hôn nhân");
        return "redirect:/chuaxacminhlist";
    }
    
    @PostMapping("/honnhan/xacminh/save")
    public String xacminhsave(@Valid HonNhan honnhan, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "xacminh";
        }
        honnhanService.save(honnhan);
        redirect.addFlashAttribute("success", "Đã xác minh hôn nhân");
        return "redirect:/chuaxacminhlist";
    }
    
    @PostMapping("/honnhan/duyet/save")
    public String duyetsave(@Valid HonNhan honnhan, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "duyet";
        }
        honnhanService.save(honnhan);
        redirect.addFlashAttribute("success", "Đã duyệt hôn nhân");
        return "redirect:/daxacminhlist";
    }
    //Xoá theo chức năng
    
    @GetMapping("/honnhan/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
    	honnhanService.delete(id);
        redirect.addFlashAttribute("success", "Đã xóa đơn");
        return "redirect:/chuaxacminhlist";
     }
    
    @GetMapping("/honnhan/daxacminh/{id}/delete")
    public String daxacminhdelete(@PathVariable int id, RedirectAttributes redirect) {
    	honnhanService.delete(id);
        redirect.addFlashAttribute("success", "Đã xóa đơn");
        return "redirect:/daxacminhlist";
     }
    
    @GetMapping("/honnhan/daduyet/{id}/delete")
    public String daduyetdelete(@PathVariable int id, RedirectAttributes redirect) {
    	honnhanService.delete(id);
        redirect.addFlashAttribute("success", "Đã xóa đơn");
        return "redirect:/daduyetlist";
     }
    //Tìm kiếm theo chức năng
    
    @GetMapping("/honnhan/chuaxacminh/search")
    public String search(@RequestParam("q") String q, Model model) {
        if (q.equals("")) {
            return "redirect:/chuaxacminhlist";
        }
        
        model.addAttribute("honnhans", honnhanService.search(q));
        model.addAttribute("xas", xaService.findAll());
        model.addAttribute("dantocs", dantocService.findAll());
        model.addAttribute("quoctichs", quoctichService.findAll());
        return "chuaxacminh_list";
    }
    
    @GetMapping("/honnhan/daxacminh/search")
    public String daxacminhsearch(@RequestParam("q") String q, Model model) {
        if (q.equals("")) {
            return "redirect:/daxacminhlist";
        }
        
        model.addAttribute("honnhans", honnhanService.search(q));
        model.addAttribute("xas", xaService.findAll());
        model.addAttribute("dantocs", dantocService.findAll());
        model.addAttribute("quoctichs", quoctichService.findAll());
        return "daxacminh_list";
    }
    
    @GetMapping("/honnhan/daduyet/search")
    public String daduyetsearch(@RequestParam("q") String q, Model model) {
        if (q.equals("")) {
            return "redirect:/daduyetlist";
        }
        
        model.addAttribute("honnhans", honnhanService.search(q));
        model.addAttribute("xas", xaService.findAll());
        model.addAttribute("dantocs", dantocService.findAll());
        model.addAttribute("quoctichs", quoctichService.findAll());
        return "daduyet_list";
    }
    //In 
    @GetMapping("/honnhan/in/{id}/edit")
    public String in(@PathVariable int id, Model model) {
        model.addAttribute("honnhan", honnhanService.findOne(id));
        model.addAttribute("xas", xaService.findAll());
        model.addAttribute("dantocs", dantocService.findAll());
        model.addAttribute("quoctichs", quoctichService.findAll());
        return "in";
    }

}
