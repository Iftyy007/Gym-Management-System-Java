package service;
import java.util.*;

import entity.Employee;
import entity.User;
import repository.EmployeeRepository;

public class EmployeeServices {

    Employee emp = new Employee ();
    List <Employee> empList = new ArrayList<Employee>();
    EmployeeRepository emrp = new EmployeeRepository ();

    
    public boolean addNewEmp (Employee emp) {

        return emrp.addNewEmpToDatabase (emp);

    }

    public Employee searchEmp (String email) {

        emp = emrp.searchEmpFromDatabase (email);
        return emp;
    }

    public List <Employee> showInfo (String s) {

        empList = emrp.getAllEmpFromDatabase (s);

        return empList;
    }
}