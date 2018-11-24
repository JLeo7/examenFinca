package com.cenfotec.examen2.webapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.cenfotec.examen2.core.Cafe;
import com.cenfotec.examen2.repo.CafeRepository;

@Controller
public class CafeController {
	
	@Autowired
	CafeRepository repo;
	
	@GetMapping("/cafe/{id}/{idProd}")
    public String cafeForm(@PathVariable Long id, @PathVariable Long idProd,Model model) {
		Cafe cafe = new Cafe();
		cafe.setIdFinca(id);
		model.addAttribute("cafe", cafe);
		model.addAttribute("idProductor", idProd);
		System.out.print(id);
		System.out.print(idProd);
        return "cafe";
    }
    
    @RequestMapping(value = "/cafe/create", method = RequestMethod.POST)
    public String cafeSubmit(@ModelAttribute Cafe cafe) {
    	repo.save(cafe);
    	return "redirect:/listarproductor/";
    }
    
    @RequestMapping(value = "listarcafe/{id}")
    public String cafeList(@PathVariable Long id, Model model) {
    	List<Cafe> cafes = new ArrayList<>();
    	for(Cafe e : repo.findAll()) if(e.getIdFinca() == id) cafes.add(e);
        model.addAttribute("cafes", cafes);
        return "listarcafe";
    }
	
}