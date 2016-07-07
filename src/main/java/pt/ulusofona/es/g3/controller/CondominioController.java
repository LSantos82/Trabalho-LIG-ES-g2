package pt.ulusofona.es.g3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pt.ulusofona.es.g3.form.CondominioBean;

@Controller
public class CondominioController {
	// Recebe por GET o pedido para mostrar o formulário
	// No ModelMap é colocado um objecto da classe CondominioFormulario com todos os
	// campos do formulário
	// invocação com http://localhost:8080/CondominioFormulario
	@RequestMapping(value = "/CondominioFormulario", method = RequestMethod.GET)
	public String getForm(ModelMap myModel) {
		CondominioBean p = new CondominioBean();
		myModel.put("condominioBean", p);
		return "CondominioFormulario";
	}

	// Recebe o formulário que envia os dados por POST
	// O objeto da classe ProprietarioBean vem preenchido
	@RequestMapping(value = "/CondominioFormulario", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("condominioBean") CondominioBean condominioBean, BindingResult bindingResult,
			ModelMap myModel) {

		myModel.addAttribute("myMensagem1", ("Nome do proprietario: " + condominioBean.getNome()));

		myModel.addAttribute("myMensagem2", ("Morada: " + condominioBean.getMorada()));
		
		myModel.addAttribute("myMensagem3", ("Cod. Postal: " + condominioBean.getCod_postal1() +  condominioBean.getCod_postal2()));
		
		myModel.addAttribute("myMensagem4", ("NIF: " + condominioBean.getNif()));

		myModel.addAttribute("myMensagem5", ("Telemóvel: " + condominioBean.getTelemovel()));
		
		myModel.addAttribute("myMensagem6", ("Telefone: " + condominioBean.getTelefone()));
		
		return "CondominioMostra";
	}
}