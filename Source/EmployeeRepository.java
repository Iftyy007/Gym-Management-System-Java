package repository;
import entity.Employee;
import java.sql.*;
import java.util.*;

public class EmployeeRepository {

    Connection c;
    Statement s;
    ResultSet r;

    Employee emp = new Employee ();
    List <Employee> empList = new ArrayList<Employee>();

    
    public EmployeeRepository () {

        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb", "root", "");
            s = c.createStatement();

        } catch (SQLException e) {

            System.out.println(e);
        }
    }

    public boolean addNewEmpToDatabase (Employee emp) {
        int i = 0;
        String s1 = "Employee";

        try {
            i = s.executeUpdate("INSERT INTO userslist (name,dob,email,phonenumber,password,gender,membershiptype,usertype,balance) VALUES ('"+emp.getName()+"','"+emp.getDateOfBirth()+"','"+emp.getEmail()+"','"+emp.getPhoneNumber()+"','"+emp.getPassword()+"','"+emp.getGender()+"','"+s1+"','2','0')");

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

    public Employee searchEmpFromDatabase (String email) {

        try {

            r = s.executeQuery("SELECT * FROM userslist WHERE email='"+email+"'");
            if (r.next()) {

                emp.setName((r.getString("name")));
                emp.setDateOfBirth((r.getString("dob")));
                emp.setEmail((r.getString("email")));
                emp.setPhoneNumber((r.getString("phonenumber")));
                emp.setPassword((r.getString("password")));
                emp.setGender((r.getString("gender")));
                emp.setMembershipType((r.getString("membershiptype")));
                return emp;

            }

            else {

                return null;
            }

        } catch (SQLException e) {

            System.out.println(e);
        }

        return null;
      
    }

    public List <Employee> getAllEmpFromDatabase (String s2) {

        try {
            String s1 = s2;
            r = s.executeQuery("SELECT * FROM userslist WHERE usertype = '"+s1+"' ");
            while (r.next()) {
                 emp = new Employee();
                 emp.setName((r.getString("name")));
                 emp.setDateOfBirth((r.getString("dob")));
                 emp.setEmail((r.getString("email")));
                 emp.setPhoneNumber((r.getString("phonenumber")));
                 emp.setPassword((r.getString("password")));
                 emp.setGender((r.getString("gender")));
                 emp.setMembershipType((r.getString("membershiptype")));
                 empList.add(emp);

            }

            return empList;



        } catch (SQLException e) {

            System.out.println(e);
        }

        return null;

    }














}

