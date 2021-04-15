package projet.appWeb;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOImplementation implements UsersDAO {

	    private DAOFactory daoFactory;

	    DAOImplementation(DAOFactory daoFactory) {
	        this.daoFactory = daoFactory;
	    }

	    public void ajouter(User user) {
	        Connection connexion = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            connexion = daoFactory.getConnection();
	            preparedStatement = connexion.prepareStatement("INSERT INTO noms(username, name, firstname, password) VALUES(?, ?, ?, ?);");
	            preparedStatement.setString(1, user.getUsername());
	            preparedStatement.setString(2, user.getName());
	            preparedStatement.setString(3, user.getFirstname());
	            preparedStatement.setString(4, user.getPassword());

	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	    }

	    public List<User> lister() {
	        List<User> users = new ArrayList<User>();
	        Connection connexion = null;
	        Statement statement = null;
	        ResultSet resultat = null;

	        try {
	            connexion = daoFactory.getConnection();
	            statement = connexion.createStatement();
	            resultat = statement.executeQuery("SELECT nom, prenom FROM noms;");

	            while (resultat.next()) {
	                String username = resultat.getString("username");
	                String name = resultat.getString("name");
	                String firstname = resultat.getString("firstname");
	                String password = resultat.getString("password");

	                User user = new User();
	                user.setUsername(username);
	                user.setName(name);
	                user.setFirstname(firstname);
	                user.setPassword(password);

	                users.add(user);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return users;
	    }

}
