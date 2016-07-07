package pt.ulusofona.es.g3.form;

public class FracaoBean {
	private String descricao,tipo_fracao,periodicidade_pag_quota;
	private int area,percentagem_area_total;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public int getPercentagem_area_total() {
		return percentagem_area_total;
	}

	public void setPercentagem_area_total(int percentagem_area_total) {
		this.percentagem_area_total = percentagem_area_total;
	}
	
	public String getTipo_fracao() {
		return tipo_fracao;
	}

	public void setTipo_fracao(String tipo_fracao) {
		this.tipo_fracao = tipo_fracao;
	}
	
	public String getPeriodicidade_pag_quota() {
		return periodicidade_pag_quota;
	}

	public void setPeriodicidade_pag_quota(String periodicidade_pag_quota) {
		this.periodicidade_pag_quota = periodicidade_pag_quota;
	}

}
