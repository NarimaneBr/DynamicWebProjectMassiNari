package projet.appWeb;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;
   
    
    private String name, password;
    
    
    public String getPassword() {
		return password;
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
    
    
    public String dispatch()
    {
    	// A valid authentication is when name is "Jack"
    	if (null != this.name && this.name.equals("Jack")) {
	    return "welcome";
    	} else {
	    return "unknown";
    	}
    }
}
