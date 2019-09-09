	package br.com.bandtec.AgendaDeObjetivos.model;

public class Credential {

	private String login;
	private String password;
	
	public Credential(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}
	
	
	
}
