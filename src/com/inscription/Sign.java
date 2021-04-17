package com.inscription;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.appweb.beans.User;
import com.appweb.db.DBConnection;

@Named("Sign")
@RequestScoped

public class Sign implements com.appweb.dao.DAO<User>{

		@Override
		public String inscrire(User user) {
			Connection connexion = DBConnection.getInstance();
			 try {
		        	PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO user(id, username, name, firstname, password) VALUES(?,?,?,?,?);");
		        	preparedStatement.setLong(1, user.getId());
		        	preparedStatement.setString(2, user.getUsername());
		            preparedStatement.setString(3, user.getName());
		            preparedStatement.setString(4, user.getFirstname());
		            preparedStatement.setString(5, user.getPassword());
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
