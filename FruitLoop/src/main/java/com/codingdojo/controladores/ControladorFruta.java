package com.codingdojo.controladores;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.modelos.Fruta;

@Controller
public class ControladorFruta {
	
	@RequestMapping("/")
	public String index(Model model) {
		
		ArrayList<Fruta> fruits = new ArrayList<Fruta>();
		
		fruits.add(new Fruta("Kiwi",1.5));
		fruits.add(new Fruta("Mango",2.0));
		fruits.add(new Fruta("Bayas de Goji",4.0));
		fruits.add(new Fruta("Guayava",0.75));
		fruits.add(new Fruta("Sandia",2.0));
		
		model.addAttribute("fruits", fruits);
		return "index.jsp";
	}
}
