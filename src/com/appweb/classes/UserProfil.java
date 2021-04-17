package com.appweb.classes;

import java.sql.*;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.appweb.beans.Post;
import com.appweb.dao.DAO;
import com.appweb.db.DBConnection;

@Named("UserProfil")
@RequestScoped
public class UserProfil implements DAO<Post>{
	
private String title;
	
	/**
	 * post text.
	 */
	private String text;
	
	private int idUser;

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
	
public String add(Post post){
	
	Connection connexion = DBConnection.getInstance();
	 try {
       	PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO post(title, text,id_user) VALUES(?,?,?);");
       	preparedStatement.setString(1, post.getTitle());
           preparedStatement.setString(2, post.getText());
           preparedStatement.setString(3, String.valueOf(post.getIdUser()));
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

