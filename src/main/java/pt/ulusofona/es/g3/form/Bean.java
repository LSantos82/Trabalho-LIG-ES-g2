package pt.ulusofona.es.g3.form;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class Bean {
	private String nome;
	private int anoInscricao;
	// A Bean Validation API converte texto em Date
	// esta anotação define a mascara que será usada na conversão
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataNascimento;
	// A Bean Validation API converte checkbox HTML em Boolean
	private boolean generoMasculino; // true ou false

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoInscricao() {
		return anoInscricao;
	}

	public void setAnoInscricao(int anoInscricao) {
		this.anoInscricao = anoInscricao;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isGeneroMasculino() {
		return generoMasculino;
	}

	public void setGeneroMasculino(boolean generoMasculino) {
		this.generoMasculino = generoMasculino;
	}
}
