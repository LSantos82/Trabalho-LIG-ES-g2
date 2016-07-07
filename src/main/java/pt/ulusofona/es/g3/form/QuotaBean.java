package pt.ulusofona.es.g3.form;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class QuotaBean {
	private String  estado,periodicidade_pag_quota,modo_pagamento,descricao_pagamento,quem_registou;
	private int numero_recibo,valor;
	// A Bean Validation API converte texto em Date
	// esta anotação define a mascara que será usada na conversão
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date data_inicio,data_fim;

	public int getNumero_recibo() {
		return numero_recibo;
	}

	public void setNumero_recibo(int numero_recibo) {
		this.numero_recibo = numero_recibo;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getPeriodicidade_pag_quota() {
		return periodicidade_pag_quota;
	}

	public void setPeriodicidade_pag_quota(String periodicidade_pag_quota) {
		this.periodicidade_pag_quota = periodicidade_pag_quota;
	}
	
	public Date getData_inicio() {
		return this.data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	
	public Date getData_fim() {
		return this.data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
	
	public String getModo_pagamento() {
		return modo_pagamento;
	}

	public void setModo_pagamento(String modo_pagamento) {
		this.modo_pagamento = modo_pagamento;
	}
	
	public String getDescricao_pagamento() {
		return descricao_pagamento;
	}

	public void setDescricao_pagamento(String descricao_pagamento) {
		this.estado = descricao_pagamento;
	}
	
	public String getQuem_registou() {
		return quem_registou;
	}

	public void setQuem_registou(String quem_registou) {
		this.quem_registou = quem_registou;
	}

	
}
