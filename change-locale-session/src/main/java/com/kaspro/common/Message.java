package com.kaspro.common;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class Message {

	public static void addMessage(Severity severity, String message) {
		FacesMessage fm = new FacesMessage(severity, message, null);
		FacesContext.getCurrentInstance().addMessage(null, fm);
	}
	
}
