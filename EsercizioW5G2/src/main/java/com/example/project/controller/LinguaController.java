package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.Lingua;

@Controller
public class LinguaController {

	@GetMapping("/home")
	public ModelAndView mostraHome() {
		return new ModelAndView("home", "linguaSelezionata", new Lingua ());
	}
	
	@PostMapping("/home-lingua")
	public ModelAndView mostraHomeLingua(@ModelAttribute("linguaSelezionata") Lingua l) {
		System.out.println(l.getLingua());
		if (l.getLingua() == "italiano") {
			return new ModelAndView("prenotazione");
		} else if (l.getLingua() == "inglese") {
			return new ModelAndView("prenotation");
		} else {
			return new ModelAndView("pageError");
		}
	}
}

