package br.com.bandtec.AgendaDeObjetivos.model;

import javax.persistence.Embeddable;

@Embeddable
public class Credential {

	private String login;
	private String password;

	public Credential() {
	}

	public Credential(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}
	
	
	
}
