package pt.ulusofona.es.g3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MenuController {
	// Recebe por GET o pedido para mostrar o formulário
	// No ModelMap é colocado um objecto da classe Menu com todos os
	// campos do formulário
	// invocação com http://localhost:8080/Menu
	@RequestMapping(value = "/Menu", method = RequestMethod.GET)
	public String getForm(ModelMap myModel) {
		return "Menu";
	}
}