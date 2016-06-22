package br.jus.cnj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(@RequestParam(value="name",required=false,defaultValue="Não digitou nada!!") String name, Model model){
		model.addAttribute("name", name);
		return "helloworld";
	}
	
}
