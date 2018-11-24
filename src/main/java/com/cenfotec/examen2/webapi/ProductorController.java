package com.cenfotec.examen2.webapi;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cenfotec.examen2.core.Productor;
import com.cenfotec.examen2.repo.ProductorRepository;

@Controller
public class ProductorController {
	
	@Autowired
	ProductorRepository repo;
	
	@RequestMapping(value = "/productor", method = RequestMethod.GET)
    public String productorForm(Model model) {
		model.addAttribute("productor", new Productor());
        return "productor";
    }

    @RequestMapping(value = "/productor/create", method = RequestMethod.POST)
    public String productorSubmit(@ModelAttribute Productor productor) {
    	repo.save(productor);
        return "redirect:/listarproductor";
    }
        
    @RequestMapping(value = "listarproductor")
    public String productorList( Model model) {
        List<Productor> productores = new ArrayList<>();
        productores = repo.findAll();
        model.addAttribute("productor", new Productor());
		model.addAttribute("productores", productores);
        return "listarproductor";
    }
    
    @RequestMapping(value = "listarproductor", method = RequestMethod.POST)
    public String productorListByName(@ModelAttribute Productor producto, Model model) {
        List<Productor> productores = repo.findByNombreContaining(producto.getNombre());
		model.addAttribute("productores", productores);
		model.addAttribute("productor", new Productor());
        return "listarproductor";
    }
	
}
