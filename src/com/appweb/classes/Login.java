package com.appweb.classes;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.appweb.beans.User;
import com.appweb.db.DBConnection;

@Named("Login")
@RequestScoped

public class Login implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String USERNAME = "username";
	private final String PASSWORD = "password";
	
	private String username,password;
	
	public String getUsername() {return username;}
	public String getPassword() {return password;}
	
	public void setUsername(String username) {this.username = username;}
	public void setPassword(String password) {this.password = password;}
	
	public String connecter(User user) {
		Connection connexion = DBConnection.getInstance();
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("SELECT username,password FROM USER where "+USERNAME+" = ? AND "+PASSWORD+" = ? ;");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getFirstname());
            preparedStatement.execute();

            preparedStatement.close();
            connexion.close();
            return "success";

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "error";
    }
	
}