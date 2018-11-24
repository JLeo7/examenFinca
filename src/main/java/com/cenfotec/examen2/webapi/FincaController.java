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

import com.cenfotec.examen2.core.Finca;
import com.cenfotec.examen2.repo.FincaRepository;

@Controller
public class FincaController {
	
	@Autowired
	FincaRepository repo;
	
	@GetMapping("/finca/{id}")
    public String fincaForm(@PathVariable Long id, Model model) {
		Finca finca = new Finca();
		finca.setIdProductor(id);
		model.addAttribute("finca", finca);
        return "finca";
    }
    
    @RequestMapping(value = "/finca/create", method = RequestMethod.POST)
    public String fincaSubmit(@ModelAttribute Finca finca) {
    	repo.save(finca);
        return "redirect:/listarFinca/" + finca.getId();
    }
    
    @RequestMapping(value = "listarfinca/{id}")
    public String fincaList(@PathVariable Long id, Model model) {
    	List<Finca> fincas = new ArrayList<>();
    	for(Finca e : repo.findAll()) if(e.getIdProductor() == id) fincas.add(e);
        model.addAttribute("fincas", fincas);
        return "listarfinca";
    }
	
}
