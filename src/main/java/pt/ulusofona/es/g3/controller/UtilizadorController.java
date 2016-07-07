package pt.ulusofona.es.g3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulusofona.es.g3.form.UtilizadorBean;

@Controller
public class UtilizadorController {
	// Recebe por GET o pedido para mostrar o formulário
	// No ModelMap é colocado um objecto da classe UtilizadorFormulario com todos os
	// campos do formulário
	// invocação com http://localhost:8080/UtilizadorFormulario
	@RequestMapping(value = "/UtilizadorFormulario", method = RequestMethod.GET)
	public String getForm(ModelMap myModel) {
		UtilizadorBean u = new UtilizadorBean();
		myModel.put("utilizadorBean", u);
		return "UtilizadorFormulario";
	}

	// Recebe o formulário que envia os dados por POST
	// O objeto da classe ProprietarioBean vem preenchido
	@RequestMapping(value = "/UtilizadorFormulario", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("utilizadorBean") UtilizadorBean utilizadorBean, BindingResult bindingResult,
			ModelMap myModel) {

		myModel.addAttribute("myMensagem1", ("Password: " + utilizadorBean.getPwd()));

		myModel.addAttribute("myMensagem2", ("Nome: " + utilizadorBean.getNome()));

		myModel.addAttribute("myMensagem3", ("Perfil: " + utilizadorBean.getPerfil()));

		return "UtilizadorMostra";
	}
}