package it.corso.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// localhost:8080?nome=Mario
@Controller
@RequestMapping("/")
public class IndexController
{
	@GetMapping
	public String getPage(
			Model model,
			@RequestParam(name = "nome", required = false, defaultValue = "Ignoto") String nome)
	{
		model.addAttribute("title", "Pagina Iniziale");
		model.addAttribute("nome", nome);
		return "index";
	}
}