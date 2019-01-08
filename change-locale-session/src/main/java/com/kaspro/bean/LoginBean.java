package com.kaspro.bean;

import java.io.Serializable;
import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.kaspro.common.Message;

@ManagedBean(name = "login")
@ViewScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private boolean login = false;
	
	public void doLogin() {
		if (!"admin".equals(username)) {
			Message.addMessage(FacesMessage.SEVERITY_ERROR, "Invalid username");
			return;
		}
		
		if (!"pa55w0rd".equals(password)) {
			Message.addMessage(FacesMessage.SEVERITY_ERROR, "Invalid password");
			return;
		}
		
		Message.addMessage(FacesMessage.SEVERITY_INFO, "Successfully logged in");
	}
	
	public void doLogout() {
		Message.addMessage(FacesMessage.SEVERITY_INFO, "Successfully logged out");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}
	
}
