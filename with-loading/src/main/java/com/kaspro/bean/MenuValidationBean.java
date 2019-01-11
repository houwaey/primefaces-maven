package com.kaspro.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "menuValidationBean")
@SessionScoped
public class MenuValidationBean {

	private boolean projectEnabled = false;

	public void testEnable(String value) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", value);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	public void enableProjectMenu() {
		projectEnabled = true;
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Project menu has been enabled");
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	public boolean isProjectEnabled() {
		return projectEnabled;
	}

	public void setProjectEnabled(boolean projectEnabled) {
		this.projectEnabled = projectEnabled;
	}
	
}