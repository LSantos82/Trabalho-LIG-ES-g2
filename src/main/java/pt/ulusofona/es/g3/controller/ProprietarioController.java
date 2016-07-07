package pt.ulusofona.es.g3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulusofona.es.g3.form.ProprietarioBean;

@Controller
public class ProprietarioController {
	// Recebe por GET o pedido para mostrar o formulário
	// No ModelMap é colocado um objecto da classe ProprietarioBean com todos os
	// campos do formulário
	// invocação com http://localhost:8080/ProprietarioFormulario
	@RequestMapping(value = "/ProprietarioFormulario", method = RequestMethod.GET)
	public String getForm(ModelMap myModel) {
		ProprietarioBean p = new ProprietarioBean();
		myModel.put("proprietarioBean", p);
		return "ProprietarioFormulario";
	}

	// Recebe o formulário que envia os dados por POST
	// O objeto da classe ProprietarioBean vem preenchido
	@RequestMapping(value = "/ProprietarioFormulario", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("proprietarioBean") ProprietarioBean proprietarioBean, 
			BindingResult bindingResult,
			ModelMap myModel) {

		myModel.addAttribute("myMensagem1", ("Nome do proprietario: " + proprietarioBean.getNome()));

		myModel.addAttribute("myMensagem2", ("Pessoa " + proprietarioBean.getTipo()));

		myModel.addAttribute("myMensagem3", ("NIF: " + proprietarioBean.getNif()));

		myModel.addAttribute("myMensagem4", ("Morada: " + proprietarioBean.getMorada()));
		
		myModel.addAttribute("myMensagem5", ("Cod. Postal: " + proprietarioBean.getCod_postal1() +  proprietarioBean.getCod_postal2()));
		
		myModel.addAttribute("myMensagem6", ("Telemóvel: " + proprietarioBean.getTelemovel()));
		
		myModel.addAttribute("myMensagem7", ("Telefone: " + proprietarioBean.getTelefone()));
		
		myModel.addAttribute("myMensagem8", ("Notas: " + proprietarioBean.getNotas()));
		
		return "ProprietarioMostra";
	}
}