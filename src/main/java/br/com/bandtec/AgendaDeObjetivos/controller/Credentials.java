package br.com.bandtec.AgendaDeObjetivos.controller;

public class Credentials {

	private String login;
	private String password;
	
	public Credentials(String login, String senha) {
		this.login = login;
		this.password = senha;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}
	
	
	
}
