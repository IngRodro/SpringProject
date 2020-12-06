package com.unab.desarrollo.springdata.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.unab.desarrollo.springdata.DAO.PersonaDao;
import com.unab.desarrollo.springdata.Entidad.Persona;

@Controller
public class ControllerPersona {
	
	@Autowired
	private PersonaDao personadao;
	
	@GetMapping("/")
	public String inicio(Model m) {
		var personas = personadao.findAll();
		
		m.addAttribute("personas", personas);
		return"index";
		}
	
	@GetMapping("/agregar")
	public String add(Persona persona) {
		return "agregar";		
	}
	@PostMapping("/guardar")
	public String guardar(Persona persona) {
		personadao.save(persona);
		return "redirect:/";
	}
	@GetMapping("/Editar/{id_persona}")
	public String editar(Persona persona,Model m) {
		persona = personadao
		return "agregar";
	}
		
	}

