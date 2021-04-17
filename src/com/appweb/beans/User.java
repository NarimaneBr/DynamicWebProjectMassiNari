package com.appweb.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named ("User")
@RequestScoped
public class User {
	

	/**
	 * The user's identifier.
	 * 
	 * Primary key.
	 */
	private int id;
	
	/**
	 * The user's firstname.
	 */
	private String firstname;
	
	/**
	 * The user's lastname.
	 */
	private String name;
	
	/**
	 * The user's username.
	 */
	private String username;
	
	/**
	 * The user's password.
	 */
	private String password;
	    
	    
	    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


		public String getPassword() {
			return password;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getFirstname() {
			return firstname;
		}


		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getName() {
	        return name;
	    }
	    
	  
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	   

}
