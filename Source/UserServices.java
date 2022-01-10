package service;
import java.util.*;

import entity.User;
import repository.UserRepository;

public class UserServices {

    User user = new User ();
    List <User> userList = new ArrayList<User>();
    UserRepository usrp = new UserRepository ();

    public boolean addNewUser (User user) {

        return usrp.addNewUserToDatabase (user);

    }

    public boolean editUser (User user) {

        return usrp.editUserToDatabase (user);
    }

    public boolean deleteUser (String email) {

        return usrp.deleteUserFromDatabase (email);
    }

    public User searchUser (String email) {

        user = usrp.searchUserFromDatabase (email);
        return user;
    }

    public List <User> showInfo (String s) {

        userList = usrp.getAllUserFromDatabase (s);

        return userList;
    }


}