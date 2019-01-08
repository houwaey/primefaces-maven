package com.kaspro.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "defaultBean")
public class DefaultBean {

	private Date date = new Date();

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
