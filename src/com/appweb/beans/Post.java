package com.appweb.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Nari
 *
 */
@Named("Post")
@RequestScoped
public class Post {
		
	/**
	 * post identifier.
	 * 
	 * Primary key.
	 */
	private int id; 
	
	/**
	 * post title.
	 */
	private String title;
	
	/**
	 * post text.
	 */
	private String text;
	
	private int idUser;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
		
	}
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	    
}
