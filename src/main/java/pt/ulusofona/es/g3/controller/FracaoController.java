package pt.ulusofona.es.g3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pt.ulusofona.es.g3.form.FracaoBean;

@Controller
public class FracaoController {
	// Recebe por GET o pedido para mostrar o formulário
	// No ModelMap é colocado um objecto da classe FracaoFormulario com todos os
	// campos do formulário
	// invocação com http://localhost:8080/FracaoFormulario
	@RequestMapping(value = "/FracaoFormulario", method = RequestMethod.GET)
	public String getForm(ModelMap myModel) {
		FracaoBean f = new FracaoBean();
		myModel.put("fracaoBean", f);
		return "FracaoFormulario";
	}

	// Recebe o formulário que envia os dados por POST
	// O objeto da classe ProprietarioBean vem preenchido
	@RequestMapping(value = "/FracaoFormulario", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("fracaoBean") FracaoBean fracaoBean, BindingResult bindingResult,
			ModelMap myModel) {

		myModel.addAttribute("myMensagem1", ("Descrição: " + fracaoBean.getDescricao()));

		myModel.addAttribute("myMensagem2", ("Área " + fracaoBean.getArea()));

		myModel.addAttribute("myMensagem3", ("Percentagem Área Total: " + fracaoBean.getPercentagem_area_total()));

		myModel.addAttribute("myMensagem4", ("Tipo Fração: " + fracaoBean.getTipo_fracao()));
		
		myModel.addAttribute("myMensagem5", ("Priodicidade Pag. Quota: " + fracaoBean.getPeriodicidade_pag_quota()));
		

		return "FracaoMostra";
	}
}