package service;
import repository.UserRepository;

public class LoginServices {

    UserRepository usrp = new UserRepository();

    public LoginServices () {

    }

    public int getValidation (String email, String password) {     

            return usrp.loginValidation(email, password);


        
    }
}
