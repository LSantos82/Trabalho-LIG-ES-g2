package pt.ulusofona.es.g3.controller;

import java.text.SimpleDateFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulusofona.es.g3.form.Bean;

@Controller
public class FController {
	// Recebe por GET o pedido para mostrar o formulário
	// No ModelMap é colocado um objecto da classe FormandoBean com todos os
	// campos do formulário
	// invocação com http://localhost:8080/FormandoFormulario
	@RequestMapping(value = "/FormandoFormulario", method = RequestMethod.GET)
	public String getForm(ModelMap myModel) {
		Bean f = new Bean();
		// myModel.addAttribute("formandoBean", f);
		myModel.put("formandoBean", f);
		return "FormandoFormulario";
	}

	// Recebe o formulário que envia os dados por POST
	// O objeto da classe FormandoBean vem preenchido
	@RequestMapping(value = "/FormandoFormulario", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("formandoBean") Bean formandoBean, BindingResult bindingResult,
			ModelMap myModel) {

		myModel.addAttribute("myMensagem1", ("O nome do formando é " + formandoBean.getNome()));

		myModel.addAttribute("myMensagem2", ("O ano de inscrição é " + formandoBean.getAnoInscricao()));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String myDataAniversario = sdf.format(formandoBean.getDataNascimento());
		myModel.addAttribute("myMensagem3", "A data de nascimento é " + myDataAniversario);

		String genero;
		if (formandoBean.isGeneroMasculino()) {
			genero = "Gémero masculino";
		} else {
			genero = "Género feminino";
		}
		myModel.addAttribute("myMensagem4", genero);
		return "FormandoMostra";
	}
}