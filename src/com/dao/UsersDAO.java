package projet.appWeb;

import java.util.List;

public interface UsersDAO {

	void ajouter( User user );
    List<User> lister();
    
}

