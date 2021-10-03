package com.tienda.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tienda.main.InterfaceService.IUserService;
import com.tienda.main.model.User;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {
	
	@Autowired
	private IUserService service;
	
	@GetMapping("/")
	public String inicio() {
		
		return "index";
	}
	
	@GetMapping("/menu")
	public String menu() {
		
		return "menu";
	}
	
	@GetMapping("/usuarios")
	public String users() {
		return "users";
	}
	
	@GetMapping("/ListadeUsuarios")
	public String listar(Model model) {
		 List<User> usuarios =  service.listar();
		 model.addAttribute("usuarios", usuarios);
		return "user_list";
	}
	
	@GetMapping("/reportes")
	public String reportes () {
		
		return "reports";
	}
}
