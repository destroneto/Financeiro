package com.algaworks.financeiro.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="cadastroTorcedorBean")
public class CadastroTorcedorBean {
	
	private String timeFavorito;

	public String getTimeFavorito() {
		return timeFavorito;
	}

	public void setTimeFavorito(String timeFavorito) {
		this.timeFavorito = timeFavorito;
	}

}
