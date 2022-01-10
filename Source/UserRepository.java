package repository;
import entity.User;
import java.sql.*;
import java.util.*;

public class UserRepository {

    Connection c;
    Statement s;
    ResultSet r;

    User user = new User();
    List <User> userList = new ArrayList<User>();

    public UserRepository () {

        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb", "root", "");
            s = c.createStatement();

        } catch (SQLException e) {

            System.out.println(e);
        }
    }

    public boolean addNewUserToDatabase (User user) {
        int i = 0;

        try {
            i = s.executeUpdate("INSERT INTO userslist (name,dob,email,phonenumber,password,gender,membershiptype,usertype,balance) VALUES ('"+user.getName()+"','"+user.getDateOfBirth()+"','"+user.getEmail()+"','"+user.getPhoneNumber()+"','"+user.getPassword()+"','"+user.getGender()+"','"+user.getMembershipType()+"','1','0')");

        } catch (SQLException e) {

            System.out.println(e);
        }
        if(i==1){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean editUserToDatabase (User user) {
        int i= 0;

        try {
            i = s.executeUpdate("UPDATE userslist SET name='"+user.getName()+"', dob='"+user.getDateOfBirth()+"', phonenumber='"+user.getPhoneNumber()+"', password='"+user.getPassword()+"', gender='"+user.getGender()+"', membershiptype='"+user.getMembershipType()+"', balance = '"+user.getBalance()+"'     WHERE email='"+user.getEmail()+"' ");

        } catch (SQLException e) {

            System.out.println(e);
        }
        if(i==1){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean deleteUserFromDatabase (String email) {

        int i = 0;

        try {

            i = s.executeUpdate("DELETE FROM userslist WHERE email='"+email+"'  ");

        } catch (SQLException e) {

            System.out.println(e);
        }
        if(i==1){
            return true;
        }
        else{
            return false;
        }

    }

    public User searchUserFromDatabase (String email) {

        try {

            r = s.executeQuery("SELECT * FROM userslist WHERE email='"+email+"'");
            if (r.next()) {

                user.setName((r.getString("name")));
                user.setDateOfBirth((r.getString("dob")));
                user.setEmail((r.getString("email")));
                user.setPhoneNumber((r.getString("phonenumber")));
                user.setPassword((r.getString("password")));
                user.setGender((r.getString("gender")));
                user.setMembershipType((r.getString("membershiptype")));
                user.setBalance(r.getString("balance"));
                return user;

            }

            else {

                return null;
            }

        } catch (SQLException e) {

            System.out.println(e);
        }

        return null;
      
    }


    public List <User> getAllUserFromDatabase (String s2) {

        try {
            String s1 = s2;
            r = s.executeQuery("SELECT * FROM userslist WHERE usertype = '"+s1+"' ");
            while (r.next()) {
                 user = new User();
                 user.setName((r.getString("name")));
                 user.setDateOfBirth((r.getString("dob")));
                 user.setEmail((r.getString("email")));
                 user.setPhoneNumber((r.getString("phonenumber")));
                 user.setPassword((r.getString("password")));
                 user.setGender((r.getString("gender")));
                 user.setMembershipType((r.getString("membershiptype")));
                 user.setBalance (r.getString("balance"));
                 userList.add(user);

            }

            return userList;



        } catch (SQLException e) {

            System.out.println(e);
        }

        return null;

    }

    public int loginValidation (String email, String password) {

        try {

            r = s.executeQuery("SELECT * FROM userslist WHERE email='"+email+"' AND password='"+password+"'");
            if(r.next()) {
                int i;
                 i = Integer.parseInt(r.getString("usertype"));

                 if (i == 0) {

                    return 0;
                 }

                 else if (i == 1 ) {

                    return 1;
                 }

                 else {

                    return 2;
                 }
            }
            


        } catch (SQLException e) {

            System.out.println(e);            
        }

        return 3;
    }
















}
