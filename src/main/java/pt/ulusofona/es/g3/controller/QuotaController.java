package pt.ulusofona.es.g3.controller;

import java.text.SimpleDateFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulusofona.es.g3.form.QuotaBean;

@Controller
public class QuotaController {
	// Recebe por GET o pedido para mostrar o formulário
	// No ModelMap é colocado um objecto da classe QuotaLancamento com todos os
	// campos do formulário
	// invocação com http://localhost:8080/QuotaLancamento
	@RequestMapping(value = "/QuotaLancamento", method = RequestMethod.GET)
	public String getForm(ModelMap myModel) {
		QuotaBean q = new QuotaBean();
		myModel.put("quotaBean", q);
		return "QuotaLancamento";
	}

	// Recebe o formulário que envia os dados por POST
	// O objeto da classe FormandoBean vem preenchido
	@RequestMapping(value = "/QuotaLancamento", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("quotaBean") QuotaBean quotaBean, BindingResult bindingResult,
			ModelMap myModel) {

		myModel.addAttribute("myMensagem1", ("Número de Recibo: " + quotaBean.getNumero_recibo()));

		myModel.addAttribute("myMensagem2", ("Estado: " + quotaBean.getEstado()));
		
		myModel.addAttribute("myMensagem3", ("Valor: " + quotaBean.getValor()));
		
		myModel.addAttribute("myMensagem4", ("Periodicidade de Pag de Quota: " + quotaBean.getPeriodicidade_pag_quota()));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String myDataInicio = sdf.format(quotaBean.getData_inicio());
		myModel.addAttribute("myMensagem5", "A data de ínicio de pagamento é " + myDataInicio);

		String myDataFim = sdf.format(quotaBean.getData_fim());
		myModel.addAttribute("myMensagem6", "A data de fim de pagamento é " + myDataFim);

		myModel.addAttribute("myMensagem7", ("Modo Pagamento: " + quotaBean.getModo_pagamento()));

		myModel.addAttribute("myMensagem8", ("Descrição de Pagamento: " + quotaBean.getDescricao_pagamento()));
		
		myModel.addAttribute("myMensagem9", ("Quota registada por " + quotaBean.getQuem_registou()));

		return "QuotaoMostra";

	}
}