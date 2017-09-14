package com.algaworks.financeiro.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "cadastroTorcedorBean")
public class CadastroTorcedorBean {

	private String timeFavorito;
	private String infoCadastro;
	private Boolean termoAceito;

	public String getTimeFavorito() {
		return timeFavorito;
	}

	public void setTimeFavorito(String timeFavorito) {
		this.timeFavorito = timeFavorito;
	}

	public void cadastrar() {
		this.infoCadastro = "O time é " + timeFavorito;
	}

	public String getInfoCadastro() {
		return infoCadastro;
	}

	public Boolean getTermoAceito() {
		return termoAceito;
	}

	public void setTermoAceito(Boolean termoAceito) {
		this.termoAceito = termoAceito;
	}	
}
