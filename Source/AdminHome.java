package userinterface;

import javax.swing.*;
//import java.awt.*;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

 import service.UserServices;
 import entity.User;

 import service.EmployeeServices;
 import entity.Employee;

 import entity.Product; 
 import service.ProductServices;


public class AdminHome extends JFrame implements ActionListener {
    User user = new User();
    UserServices us = new UserServices();
    List <User> userList = new ArrayList<User>();

    Employee emp = new Employee();
    EmployeeServices es = new EmployeeServices();
    List <Employee> empList = new ArrayList<Employee>();

    Product pro = new Product();
    ProductServices ps = new ProductServices();
    List <Product> pList = new ArrayList<Product>();

    JLabel adminPanelLabel = new JLabel("Admin Panel ");

    JPanel jpanelAdd = new JPanel();
    JPanel jpanelEdit = new JPanel();
    JPanel jpanelDelete = new JPanel();
    JPanel jpanelSearch = new JPanel();
    JPanel jpanelUserList = new JPanel();
    JPanel jpanelEmpAdd = new JPanel();
    JPanel jpanelEmpList = new JPanel();
    JPanel jPanelProList = new JPanel();
    JPanel jpanelEditPro = new JPanel();
    JPanel jpanelAddProduct = new JPanel();

    JButton addUserButton = new JButton("Add New User");
    JButton editUserButton = new JButton("Edit User");
    JButton deleteUserButton = new JButton("Delete User");
    JButton searchUserButton = new JButton("Search User");
    JButton userListButton = new JButton("User List");
    JButton addEmployeeButton = new JButton("Add New Employee");
    JButton empListButton = new JButton("Employee List");
    JButton showProductButton = new JButton("Show Products");
    JButton editProductButton = new JButton("Edit Products");
    JButton addproduct =new JButton("Add Product");

    JLabel sNameLabel = new JLabel("Name");
    JLabel sDobLabel = new JLabel("Date of Birth");
    JLabel sEmailLabel = new JLabel("Email");
    JLabel sPasswordLabel = new JLabel("Password");
    JLabel sConfirmPasswordLabel = new JLabel("Confirm Password");
    JLabel sGenderLabel = new JLabel("Gender");
    JLabel sMemberShipTypeLabel = new JLabel("MemberShipType");
    JLabel sPhoneNumberLabel = new JLabel("Phone Number");
    JLabel sBalanceLabel = new JLabel("Balance");
    JLabel pnameLabel = new JLabel("Name");
    JLabel pPriceLabel = new JLabel("Price");
    JLabel pTypeLabel = new JLabel("Type");
    JLabel pDescriptionLabel = new JLabel("Description");

    JLabel eNameLabel = new JLabel("Name");
    JLabel eDobLabel = new JLabel("Date of Birth");
    JLabel eEmailLabel = new JLabel("Email");
    JLabel ePasswordLabel = new JLabel("Password");
    JLabel eConfirmPasswordLabel = new JLabel("Confirm Password");
    JLabel eGenderLabel = new JLabel("Gender");
    JLabel eMemberShipTypeLabel = new JLabel("MemberShipType");
    JLabel ePhoneNumberLabel = new JLabel("Phone Number");

    JTextField sNameTextField = new JTextField();
    JTextField sDobTextField = new JTextField();
    JTextField sEmailTextField = new JTextField();
    JTextField sPhoneNumberTextField = new JTextField();
    JTextField sPasswordField = new JTextField();
    JTextField sConfirmPasswordField = new JTextField();
    JTextField sBalanceTextField = new JTextField ();

    JTextField addempNameTextField = new JTextField();
    JTextField addempDobTextField = new JTextField();
    JTextField addempEmailTextField = new JTextField();
    JTextField addempPhoneNumberTextField = new JTextField();
    JTextField addempPasswordField = new JTextField();
    JTextField addempConfirmPasswordField = new JTextField();

    JTextField editNameTextField = new JTextField();
    JTextField editDobTextField = new JTextField();
    JTextField editEmailTextField = new JTextField();
    JTextField editPhoneNumberTextField = new JTextField();
    JTextField editPasswordField = new JTextField();
    JTextField editConfirmPasswordField = new JTextField();
    JTextField editBalanceTextField = new JTextField ();


    JTextField pnameTextField = new JTextField();
    JTextField pPriceTextField = new JTextField();
    JTextField pTypeTextField = new JTextField();
    JTextField pDescriptionTextField = new JTextField();

    
    JTextField addpnameTextField = new JTextField();
    JTextField addpPriceTextField = new JTextField();
    JTextField addpTypeTextField = new JTextField();
    JTextField addpDescriptionTextField = new JTextField();


    JRadioButton sMaleRadioButton = new JRadioButton("Male");
    JRadioButton sFemaleRadioButton = new JRadioButton("Female");
    
    JRadioButton sRegularRadioButton = new JRadioButton("Regular");
    JRadioButton sPremiumRadioButton = new JRadioButton("Premium");

    ButtonGroup sGenderbButtonGroup = new ButtonGroup();
    ButtonGroup sMemberShipTypeButtonGroup = new ButtonGroup();

    JButton add=new JButton("Add");
    JButton adde = new JButton("Add");
    JButton save=new JButton("Save");
    JButton savep=new JButton("Save");
    JButton delete=new JButton("Delete");
    JButton search=new JButton("Search");
    JButton searchp=new JButton("Search");
    JButton searchedituser =new JButton("Search");
    JButton saveProduct =new JButton("Save");
    

    public AdminHome () {

        this.setSize(1000,700);
        this.getContentPane().setBackground(Color.BLACK);
        //this.
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Admin Panel");
        this.setFont(new Font("serif",Font.BOLD,20));
        //this.getContentPane.setBackground(Color.GRAY);

        jpanelAdd.setBounds(200, 100, 800, 600);
        jpanelAdd.setBackground(Color.black);
        jpanelAdd.setLayout(null);
        this.add(jpanelAdd);

        jpanelEdit.setBounds(200, 100, 800, 600);
        jpanelEdit.setBackground(Color.black);
        jpanelEdit.setLayout(null);
        this.add(jpanelEdit);

        jpanelDelete.setBounds(200, 100, 800, 600);
        jpanelDelete.setBackground(Color.black);
        jpanelDelete.setLayout(null);
        this.add(jpanelDelete);

        jpanelSearch.setBounds(200, 100, 800, 600);
        jpanelSearch.setBackground(Color.black);
        jpanelSearch.setLayout(null);
        this.add(jpanelSearch);

        jpanelUserList.setBounds(200, 100, 800, 600);
        jpanelUserList.setBackground(Color.black);
        jpanelUserList.setLayout(null);
        this.add(jpanelUserList);

        jpanelEmpAdd.setBounds(200, 100, 800, 600);
        jpanelEmpAdd.setBackground(Color.black);
        jpanelEmpAdd.setLayout(null);
        this.add(jpanelEmpAdd);

        jpanelEmpList.setBounds(200, 100, 800, 600);
        jpanelEmpList.setBackground(Color.black);
        jpanelEmpList.setLayout(null);
        this.add(jpanelEmpList);

        jPanelProList.setBounds(200, 100, 800, 600);
        jPanelProList.setBackground(Color.black);
        jPanelProList.setLayout(null);
        this.add(jPanelProList);

        jpanelEditPro.setBounds(200, 100, 800, 600);
        jpanelEditPro.setBackground(Color.black);
        jpanelEditPro.setLayout(null);
        this.add(jpanelEditPro);

        jpanelAddProduct.setBounds(200, 100, 800, 600);
        jpanelAddProduct.setBackground(Color.black);
        jpanelAddProduct.setLayout(null);
        this.add(jpanelAddProduct);


        jpanelAdd.setVisible(false);
        jpanelEdit.setVisible(false);
        jpanelDelete.setVisible(false);
        jpanelSearch.setVisible(false);
        jpanelUserList.setVisible(false);
        jpanelEmpAdd.setVisible(false);
        jpanelEmpList.setVisible(false);
        jPanelProList.setVisible(false);
        jpanelEditPro.setVisible(false);
        jpanelAddProduct.setVisible(false);

        adminPanelLabel.setBounds(450, 50, 200, 25);
        adminPanelLabel.setFont(new Font("serif",Font.BOLD,20));
        adminPanelLabel.setForeground(Color.lightGray);
        this.add(adminPanelLabel);

        addUserButton.setBounds(20,100, 150, 25);
        addUserButton.setForeground(Color.lightGray);
        addUserButton.setBackground(Color.black);
        this.add(addUserButton);
        addUserButton.addActionListener(this);

        editUserButton.setBounds(20, 150, 150, 25);
        editUserButton.setForeground(Color.lightGray);
        editUserButton.setBackground(Color.black);
        this.add(editUserButton);
        editUserButton.addActionListener(this);

        deleteUserButton.setBounds(20, 200, 150, 25);
        deleteUserButton.setForeground(Color.lightGray);
        deleteUserButton.setBackground(Color.black);
        this.add(deleteUserButton);
        deleteUserButton.addActionListener(this);

        searchUserButton.setBounds(20, 250, 150, 25);
        searchUserButton.setForeground(Color.lightGray);
        searchUserButton.setBackground(Color.black);
        this.add(searchUserButton);
        searchUserButton.addActionListener(this);

        userListButton.setBounds(20, 300, 150, 25);
        userListButton.setForeground(Color.lightGray);
        userListButton.setBackground(Color.black);
        this.add(userListButton);
        userListButton.addActionListener(this);

        addEmployeeButton.setBounds(20, 350, 150, 25);
        addEmployeeButton.setForeground(Color.lightGray);
        addEmployeeButton.setBackground(Color.black);
        this.add(addEmployeeButton);
        addEmployeeButton.addActionListener(this);

        
        empListButton.setBounds(20, 400, 150, 25);
        empListButton.setForeground(Color.lightGray);
        empListButton.setBackground(Color.black);
        this.add(empListButton);
        empListButton.addActionListener (this);

        showProductButton.setBounds(20,450,150,25);
        showProductButton.setForeground(Color.lightGray);
        showProductButton.setBackground(Color.black);
        this.add(showProductButton);
        showProductButton.addActionListener(this);

        editProductButton.setBounds(20,500,150,25);
        editProductButton.setForeground(Color.lightGray);
        editProductButton.setBackground(Color.black);
        this.add(editProductButton);
        editProductButton.addActionListener(this);

        addproduct.setBounds(20,550,150,25);
        addproduct.setForeground(Color.lightGray);
        addproduct.setBackground(Color.black);
        this.add(addproduct);
        addproduct.addActionListener(this);


    }

    

    @Override
    public void actionPerformed (ActionEvent e) {

       if (e.getSource() == addUserButton) {

            jpanelAdd.setVisible(true);
            jpanelEdit.setVisible(false);
            jpanelDelete.setVisible(false);
            jpanelSearch.setVisible(false);
            jpanelUserList.setVisible(false);
            jpanelEmpAdd.setVisible(false);
            jpanelEmpList.setVisible(false);
            jPanelProList.setVisible(false);
            jpanelEditPro.setVisible(false);
            jpanelAddProduct.setVisible(false);

            sNameLabel.setBounds(200, 50, 150,25);
            sNameLabel.setForeground(Color.lightGray);
            sDobLabel.setBounds(200, 100, 150,25);
            sDobLabel.setForeground(Color.lightGray);
            sEmailLabel.setBounds(200, 150, 150,25);
            sEmailLabel.setForeground(Color.lightGray);
            sPhoneNumberLabel.setBounds(200, 200, 150,25);
            sPhoneNumberLabel.setForeground(Color.lightGray);
            sPasswordLabel.setBounds(200, 250, 150,25);
            sPasswordLabel.setForeground(Color.lightGray);
            sConfirmPasswordLabel.setBounds(200, 300, 150,25);
            sConfirmPasswordLabel.setForeground(Color.lightGray);
            sGenderLabel.setBounds(200, 350, 150,25);
            sGenderLabel.setForeground(Color.lightGray);
            sMemberShipTypeLabel.setBounds(200, 400, 150,25);
            sMemberShipTypeLabel.setForeground(Color.lightGray);



            sNameTextField.setBounds(400, 50, 150,25);
            sDobTextField.setBounds(400, 100, 150,25);
            sEmailTextField.setBounds(400, 150, 150,25);
            sPhoneNumberTextField.setBounds(400, 200, 150,25);
            sPasswordField.setBounds(400, 250, 150,25);
            sConfirmPasswordField.setBounds(400, 300, 150,25);

            sMaleRadioButton.setBounds(400, 350, 70,25);
            sMaleRadioButton.setBackground (Color.black);
            sMaleRadioButton.setForeground (Color.lightGray);
            sFemaleRadioButton.setBounds(480, 350, 70,25);
            sFemaleRadioButton.setBackground (Color.black);
            sFemaleRadioButton.setForeground (Color.lightGray);
            sRegularRadioButton.setBounds(400, 400, 70,25);
            sRegularRadioButton.setBackground (Color.black);
            sRegularRadioButton.setForeground (Color.lightGray);
            sPremiumRadioButton.setBounds(480, 400, 80,25);
            sPremiumRadioButton.setBackground (Color.black);
            sPremiumRadioButton.setForeground (Color.lightGray);
            add.setBounds(400, 450, 150, 25);

            sGenderbButtonGroup.add(sMaleRadioButton);
            sGenderbButtonGroup.add(sFemaleRadioButton);
            sMemberShipTypeButtonGroup.add(sRegularRadioButton);
            sMemberShipTypeButtonGroup.add(sPremiumRadioButton);

            jpanelAdd.add(sNameLabel);
            jpanelAdd.add(sDobLabel);
            jpanelAdd.add(sEmailLabel);
            jpanelAdd.add(sPhoneNumberLabel);
            jpanelAdd.add(sPasswordLabel);
            jpanelAdd.add(sConfirmPasswordLabel);
            jpanelAdd.add(sGenderLabel);
            jpanelAdd.add(sMemberShipTypeLabel);

            jpanelAdd.add(sNameTextField);
            jpanelAdd.add(sDobTextField);
            jpanelAdd.add(sEmailTextField);
            jpanelAdd.add(sPhoneNumberTextField);
            jpanelAdd.add(sPasswordField);
            jpanelAdd.add(sConfirmPasswordField);
            jpanelAdd.add(sMaleRadioButton);
            jpanelAdd.add(sFemaleRadioButton);
            jpanelAdd.add(sRegularRadioButton);
            jpanelAdd.add(sPremiumRadioButton);

            add.setForeground(Color.lightGray);
            add.setBackground(Color.black);
            jpanelAdd.add(add);

            add.addActionListener(new ActionListener(){
            
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (sNameTextField.getText().equals("") || sDobTextField.equals("") || sEmailTextField.equals("") || sPhoneNumberTextField.equals("") || sPasswordField.equals("") || sConfirmPasswordField.equals("") || sMaleRadioButton.isSelected() == false && sFemaleRadioButton.isSelected() == false || sRegularRadioButton.isSelected() == false && sPremiumRadioButton.isSelected() == false )  {

                        JOptionPane.showMessageDialog(jpanelAdd, "Fill up the form properly", "Notification", JOptionPane.ERROR_MESSAGE);
                    }                   

                    else {

                        
                    user.setName(sNameTextField.getText());
                    user.setDateOfBirth(sDobTextField.getText());
                    user.setEmail(sEmailTextField.getText());
                    user.setPhoneNumber(sPhoneNumberTextField.getText());
                    user.setPassword(sPasswordField.getText());

                    if (sMaleRadioButton.isSelected() == true) {
                        user.setGender(sMaleRadioButton.getText());
                    }

                    else if (sFemaleRadioButton.isSelected() == true ) {

                        user.setGender(sFemaleRadioButton.getText());
                    }

                    else {
                        JOptionPane.showMessageDialog(jpanelAdd, "Please select gender", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                    if(sRegularRadioButton.isSelected() == true) {

                        user.setMembershipType(sRegularRadioButton.getText());
                    }

                    else if (sPremiumRadioButton.isSelected() == true) {

                        user.setMembershipType(sPremiumRadioButton.getText());
                    }

                    
                    

                    if(us.addNewUser(user)){
                        JOptionPane.showMessageDialog(jpanelAdd, "User Added", "Message", JOptionPane.INFORMATION_MESSAGE);

                        sNameTextField.setText("");
                        sDobTextField.setText("");
                        sEmailTextField.setText("");
                        sPhoneNumberTextField.setText("");
                        sPasswordField.setText("");
                        sConfirmPasswordField.setText("");
                        sMaleRadioButton.setSelected(false);
                        sFemaleRadioButton.setSelected(false);
                        sRegularRadioButton.setSelected(false);
                        sPremiumRadioButton.setSelected(false);

                           
                    }
                    else{
                        JOptionPane.showMessageDialog(jpanelAdd, "Unable To Add", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    }

                    

                    
                }
            });

            
        }

       else if (e.getSource() == editUserButton) {

            jpanelAdd.setVisible(false);
            jpanelEdit.setVisible(true);
            jpanelDelete.setVisible(false);
            jpanelSearch.setVisible(false);
            jpanelUserList.setVisible(false);
            jpanelEmpAdd.setVisible(false);
            jpanelEmpList.setVisible(false);
            jPanelProList.setVisible(false);
            jpanelEditPro.setVisible(false);
            jpanelAddProduct.setVisible(false);


            sNameLabel.setBounds(200, 100, 150,25);
            sNameLabel.setForeground(Color.lightGray);
            sDobLabel.setBounds(200, 150, 150,25);
            sDobLabel.setForeground(Color.lightGray);
            sEmailLabel.setBounds(200, 50, 150,25);
            sEmailLabel.setForeground(Color.lightGray);
            sPhoneNumberLabel.setBounds(200, 200, 150,25);
            sPhoneNumberLabel.setForeground(Color.lightGray);
            sPasswordLabel.setBounds(200, 250, 150,25);
            sPasswordLabel.setForeground(Color.lightGray);
            sConfirmPasswordLabel.setBounds(200, 300, 150,25);
            sConfirmPasswordLabel.setForeground(Color.lightGray);
            sGenderLabel.setBounds(200, 400, 150,25);                           
            sGenderLabel.setForeground(Color.lightGray);
            sMemberShipTypeLabel.setBounds(200, 450, 150,25);                  
            sMemberShipTypeLabel.setForeground(Color.lightGray);
            sBalanceLabel.setBounds(200,350,150,25);                            
            sBalanceLabel.setForeground(Color.lightGray);
            

            editNameTextField.setBounds(400, 100, 150,25);
            editDobTextField.setBounds(400, 150, 150,25);
            editEmailTextField.setBounds(400, 50, 150,25);
            editPhoneNumberTextField.setBounds(400, 200, 150,25);
            editPasswordField.setBounds(400, 250, 150,25);
            editConfirmPasswordField.setBounds(400, 300, 150,25);
            sMaleRadioButton.setBounds(400, 400, 70,25);
            sFemaleRadioButton.setBounds(480, 400, 70,25);
            sRegularRadioButton.setBounds(400, 450, 70,25);
            sPremiumRadioButton.setBounds(480, 450, 80,25);
            editBalanceTextField.setBounds(400,350,150,25);
            save.setBounds(400, 500, 150, 25);
            save.setForeground(Color.lightGray);
            save.setBackground(Color.black);

            sGenderbButtonGroup.add(sMaleRadioButton);
            sGenderbButtonGroup.add(sFemaleRadioButton);
            sMemberShipTypeButtonGroup.add(sRegularRadioButton);
            sMemberShipTypeButtonGroup.add(sPremiumRadioButton);

            jpanelEdit.add(sNameLabel);
            jpanelEdit.add(sDobLabel);
            jpanelEdit.add(sEmailLabel);
            jpanelEdit.add(sPhoneNumberLabel);
            jpanelEdit.add(sPasswordLabel);
            jpanelEdit.add(sConfirmPasswordLabel);
            jpanelEdit.add(sGenderLabel);
            jpanelEdit.add(sMemberShipTypeLabel);
            jpanelEdit.add (sBalanceLabel);

            jpanelEdit.add(editNameTextField);
            jpanelEdit.add(editDobTextField);
            jpanelEdit.add(editEmailTextField);
            jpanelEdit.add(editPhoneNumberTextField);
            jpanelEdit.add(editPasswordField);
            jpanelEdit.add(editConfirmPasswordField);
            jpanelEdit.add(sMaleRadioButton);
            jpanelEdit.add(sFemaleRadioButton);
            jpanelEdit.add(sRegularRadioButton);
            jpanelEdit.add(sPremiumRadioButton);
            jpanelEdit.add(editBalanceTextField);
            jpanelEdit.add(save);

            searchedituser.setBounds(600, 50, 100, 25);
            searchedituser.setForeground(Color.lightGray);
            searchedituser.setBackground(Color.black);
            
            jpanelEdit.add(searchedituser);

            searchedituser.addActionListener(new ActionListener(){
            
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    user = us.searchUser (editEmailTextField.getText());
                    if(user == null) {

                        JOptionPane.showMessageDialog(jpanelEdit,"User Not Found", "Not Found", JOptionPane.INFORMATION_MESSAGE);
                    }

                    else {

                        editNameTextField.setText(user.getName());
                        editDobTextField.setText(user.getDateOfBirth());
                        editPhoneNumberTextField.setText(user.getPhoneNumber());
                        editPasswordField.setText(user.getPassword());
                        editConfirmPasswordField.setText(user.getPassword());
                        editBalanceTextField.setText(user.getBalance());

                        if (user.getGender().equals("Male")) {
                            sMaleRadioButton.setSelected(true);
                        }
                        else {
                            sFemaleRadioButton.setSelected(true);
                        }

                        if (user.getMembershipType().equals("Regular")) {
                            sRegularRadioButton.setSelected(true);
                        }
                        else {

                            sPremiumRadioButton.setSelected(true);
                        }


                    } 
                }
            });

            save.addActionListener(new ActionListener(){
            
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (editNameTextField.getText().equals("") || editDobTextField.getText().equals("") || editEmailTextField.getText().equals("") || editPhoneNumberTextField.getText().equals("") || editPasswordField.getText().equals("") || editConfirmPasswordField.getText().equals("") || sMaleRadioButton.isSelected() == false && sFemaleRadioButton.isSelected() == false || sRegularRadioButton.isSelected() == false && sPremiumRadioButton.isSelected() == false )  {

                        JOptionPane.showMessageDialog(jpanelAdd, "Fill up the form properly", "Notification", JOptionPane.ERROR_MESSAGE);
                    } 

                    else {
                        user.setName(editNameTextField.getText());
                        user.setDateOfBirth(editDobTextField.getText());
                        user.setEmail(editEmailTextField.getText());
                        user.setPhoneNumber(editPhoneNumberTextField.getText());
                        user.setPassword(editPasswordField.getText());
                        user.setBalance (editBalanceTextField.getText());
    
                        if (sMaleRadioButton.isSelected() == true) {
    
                            user.setGender(sMaleRadioButton.getText());
                        }
                        else {
                            user.setGender(sFemaleRadioButton.getText());
                        }
    
                        if (sRegularRadioButton.isSelected() == true) {
    
                            user.setMembershipType(sRegularRadioButton.getText());
                        }
                        else {
    
                            user.setMembershipType(sPremiumRadioButton.getText());
                        }
    
                        if (us.editUser(user)) {
    
                            JOptionPane.showMessageDialog(jpanelEdit, "User Information Updated", "Message", JOptionPane.INFORMATION_MESSAGE);
                            
                            editNameTextField.setText("");
                            editEmailTextField.setText("");
                            editDobTextField.setText("");
                            editPhoneNumberTextField.setText("");
                            editPasswordField.setText("");
                            editConfirmPasswordField.setText("");
                            editBalanceTextField.setText("");
                            sMaleRadioButton.setSelected(false);
                            sFemaleRadioButton.setSelected(false);
                            sRegularRadioButton.setSelected(false);
                            sPremiumRadioButton.setSelected(false);
    

                        }
    
                        else {
                            JOptionPane.showMessageDialog(jpanelEdit, "User Information can not be Updated", "Error", JOptionPane.ERROR_MESSAGE);
                         }

                    }
                    
                   




                }
            });
        }

        else if (e.getSource() == deleteUserButton ) {

            jpanelAdd.setVisible(false);
            jpanelEdit.setVisible(false);
            jpanelDelete.setVisible(true);
            jpanelSearch.setVisible(false);
            jpanelUserList.setVisible(false);
            jpanelEmpAdd.setVisible(false);
            jpanelEmpList.setVisible(false);
            jPanelProList.setVisible(false);
            jpanelEditPro.setVisible(false);
            jpanelAddProduct.setVisible(false);

            sNameLabel.setBounds(200, 100, 150,25);
            sNameLabel.setForeground(Color.lightGray);
            sDobLabel.setBounds(200, 150, 150,25);
            sDobLabel.setForeground(Color.lightGray);
            sEmailLabel.setBounds(200, 50, 150,25);
            sEmailLabel.setForeground(Color.lightGray);
            sPhoneNumberLabel.setBounds(200, 200, 150,25);
            sPhoneNumberLabel.setForeground(Color.lightGray);
            sPasswordLabel.setBounds(200, 250, 150,25);
            sPasswordLabel.setForeground(Color.lightGray);
            sConfirmPasswordLabel.setBounds(200, 300, 150,25);
            sConfirmPasswordLabel.setForeground(Color.lightGray);
            sGenderLabel.setBounds(200, 350, 150,25);
            sGenderLabel.setForeground(Color.lightGray);
            sMemberShipTypeLabel.setBounds(200, 400, 150,25);
            sMemberShipTypeLabel.setForeground(Color.lightGray);

            sNameTextField.setBounds(400, 100, 150,25);
            sDobTextField.setBounds(400, 150, 150,25);
            sEmailTextField.setBounds(400, 50, 150,25);
            sPhoneNumberTextField.setBounds(400, 200, 150,25);
            sPasswordField.setBounds(400, 250, 150,25);
            sConfirmPasswordField.setBounds(400, 300, 150,25);
            JTextField genderTextField = new JTextField();
            genderTextField.setBounds(400, 350, 150, 25);
            JTextField membershipTextField = new JTextField();
            membershipTextField.setBounds(400, 400, 150, 25);
           // sMaleRadioButton.setBounds(400, 350, 70,25);
            //sFemaleRadioButton.setBounds(480, 350, 70,25);
            //sRegularRadioButton.setBounds(400, 400, 70,25);
            //sPremiumRadioButton.setBounds(480, 400, 80,25);
            delete.setBounds(400, 450, 150, 25);
            delete.setForeground(Color.lightGray);
            delete.setBackground(Color.black);

            // sGenderbButtonGroup.add(sMaleRadioButton);
            // sGenderbButtonGroup.add(sFemaleRadioButton);
            // sMemberShipTypeButtonGroup.add(sRegularRadioButton);
            // sMemberShipTypeButtonGroup.add(sPremiumRadioButton);

            jpanelDelete.add(sNameLabel);
            jpanelDelete.add(sDobLabel);
            jpanelDelete.add(sEmailLabel);
            jpanelDelete.add(sPhoneNumberLabel);
            jpanelDelete.add(sPasswordLabel);
            jpanelDelete.add(sConfirmPasswordLabel);
            jpanelDelete.add(sGenderLabel);
            jpanelDelete.add(sMemberShipTypeLabel);

            jpanelDelete.add(sNameTextField);
            jpanelDelete.add(sDobTextField);
            jpanelDelete.add(sEmailTextField);
            jpanelDelete.add(sPhoneNumberTextField);
            jpanelDelete.add(sPasswordField);
            jpanelDelete.add(sConfirmPasswordField);
            // jpanelDelete.add(sMaleRadioButton);
            // jpanelDelete.add(sFemaleRadioButton);
            // jpanelDelete.add(sRegularRadioButton);
            // jpanelDelete.add(sPremiumRadioButton);
            jpanelDelete.add(genderTextField);
            jpanelDelete.add(membershipTextField);
            jpanelDelete.add(delete);

            search.setBounds(600, 50, 100, 25);
            search.setForeground(Color.lightGray);
            search.setBackground(Color.black);
            jpanelDelete.add(search);

            search.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e) {
                    
                    user = us.searchUser (sEmailTextField.getText());
                    if(user == null) {

                        JOptionPane.showMessageDialog(jpanelDelete,"User Not Found", "Not Found", JOptionPane.INFORMATION_MESSAGE);
                    }

                    else if (user.getEmail().equals("admin@gmail.com")) {

                        JOptionPane.showMessageDialog(jpanelDelete,"Admin can not be removed", "Not Found", JOptionPane.ERROR_MESSAGE);
                    }

                    else {

                        sNameTextField.setText(user.getName());
                        sDobTextField.setText(user.getDateOfBirth());
                        sPhoneNumberTextField.setText(user.getPhoneNumber());
                        sPasswordField.setText(user.getPassword());
                        sConfirmPasswordField.setText(user.getPassword());

                        if (user.getGender().equals("Male")) {
                            //sMaleRadioButton.setSelected(true);
                            genderTextField.setText("Male");
                        }
                        else {
                            //sFemaleRadioButton.setSelected(true);
                            genderTextField.setText("Female");
                        }

                        if (user.getMembershipType().equals("Regular")) {
                            //sRegularRadioButton.setSelected(true);
                            membershipTextField.setText("Regular");
                        }
                        else {

                            //sPremiumRadioButton.setSelected(true);
                            membershipTextField.setText("premium");
                        }


                    } 
                }
            });

            delete.addActionListener(new ActionListener(){
            
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = JOptionPane.showConfirmDialog(jpanelDelete, "Are you sure?", "Delete", JOptionPane.YES_NO_CANCEL_OPTION);

                    if (i==0) {

                        if (us.deleteUser(sEmailTextField.getText())) {
                            JOptionPane.showMessageDialog(jpanelDelete, "User deleted");

                            sNameTextField.setText("");
                            sDobTextField.setText("");
                            sEmailTextField.setText("");
                            sPhoneNumberTextField.setText("");
                            sPasswordField.setText("");
                            sConfirmPasswordField.setText("");
                            genderTextField.setText("");
                            membershipTextField.setText("");
                        }

                        else {

                            JOptionPane.showMessageDialog(jpanelDelete, "Error Occured");
                        }
                    } 


                }
            });

        }

        else if (e.getSource() == searchUserButton) {

            jpanelAdd.setVisible(false);
            jpanelEdit.setVisible(false);
            jpanelDelete.setVisible(false);
            jpanelSearch.setVisible(true);
            jpanelUserList.setVisible(false);
            jpanelEmpAdd.setVisible(false);
            jpanelEmpList.setVisible(false);
            jPanelProList.setVisible(false);
            jpanelEditPro.setVisible(false);
            jpanelAddProduct.setVisible(false);

            sNameLabel.setBounds(200, 100, 150,25);
            sNameLabel.setForeground(Color.lightGray);
            sDobLabel.setBounds(200, 150, 150,25);
            sDobLabel.setForeground(Color.lightGray);
            sEmailLabel.setBounds(200, 50, 150,25);
            sEmailLabel.setForeground(Color.lightGray);
            sPhoneNumberLabel.setBounds(200, 200, 150,25);
            sPhoneNumberLabel.setForeground(Color.lightGray);
            sPasswordLabel.setBounds(200, 250, 150,25);
            sPasswordLabel.setForeground(Color.lightGray);
            sConfirmPasswordLabel.setBounds(200, 300, 150,25);
            sConfirmPasswordLabel.setForeground(Color.lightGray);
            sGenderLabel.setBounds(200, 350, 150,25);
            sGenderLabel.setForeground(Color.lightGray);
            sMemberShipTypeLabel.setBounds(200, 400, 150,25);
            sMemberShipTypeLabel.setForeground(Color.lightGray);
            sBalanceLabel.setBounds(200,450,150,25);
            sBalanceLabel.setForeground(Color.lightGray);

            sNameTextField.setBounds(400, 100, 150,25);
            sDobTextField.setBounds(400, 150, 150,25);
            sEmailTextField.setBounds(400, 50, 150,25);
            sPhoneNumberTextField.setBounds(400, 200, 150,25);
            sPasswordField.setBounds(400, 250, 150,25);
            sConfirmPasswordField.setBounds(400, 300, 150,25);
            JTextField genderTextField = new JTextField();
            genderTextField.setBounds(400, 350, 150, 25);
            JTextField membershipTextField = new JTextField();
            membershipTextField.setBounds(400, 400, 150, 25);
            sBalanceTextField.setBounds(400,450,150,25);
        

            jpanelSearch.add(sNameLabel);
            jpanelSearch.add(sDobLabel);
            jpanelSearch.add(sEmailLabel);
            jpanelSearch.add(sPhoneNumberLabel);
            jpanelSearch.add(sPasswordLabel);
            jpanelSearch.add(sConfirmPasswordLabel);
            jpanelSearch.add(sGenderLabel);
            jpanelSearch.add(sMemberShipTypeLabel);
            jpanelSearch.add(sBalanceLabel);

            jpanelSearch.add(sNameTextField);
            jpanelSearch.add(sDobTextField);
            jpanelSearch.add(sEmailTextField);
            jpanelSearch.add(sPhoneNumberTextField);
            jpanelSearch.add(sPasswordField);
            jpanelSearch.add(sConfirmPasswordField);
            jpanelSearch.add (sBalanceTextField);
          
            jpanelSearch.add(genderTextField);
            jpanelSearch.add(membershipTextField);
            

            search.setBounds(600, 50, 100, 25);
            search.setForeground(Color.lightGray);
            search.setBackground(Color.black);
            jpanelSearch.add(search);

            search.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e) {
                    
                    user = us.searchUser (sEmailTextField.getText());
                    if(user == null) {

                        JOptionPane.showMessageDialog(jpanelSearch,"User Not Found", "Not Found", JOptionPane.INFORMATION_MESSAGE);
                    }

                    else {

                        sNameTextField.setText(user.getName());
                        sDobTextField.setText(user.getDateOfBirth());
                        sPhoneNumberTextField.setText(user.getPhoneNumber());
                        sPasswordField.setText(user.getPassword());
                        sConfirmPasswordField.setText(user.getPassword());
                        sBalanceTextField.setText(user.getBalance());

                        if (user.getGender().equals("Male")) {
                            //sMaleRadioButton.setSelected(true);
                            genderTextField.setText("Male");
                        }
                        else {
                            //sFemaleRadioButton.setSelected(true);
                            genderTextField.setText("Female");
                        }

                        if (user.getMembershipType().equals("Regular")) {
                            //sRegularRadioButton.setSelected(true);
                            membershipTextField.setText("Regular");
                        }
                        else {

                            //sPremiumRadioButton.setSelected(true);
                            membershipTextField.setText("premium");
                        }


                    } 
                }
            });


        }

        else if (e.getSource() == userListButton) {

            jpanelAdd.setVisible(false);
            jpanelEdit.setVisible(false);
            jpanelDelete.setVisible(false);
            jpanelSearch.setVisible(false);
            jpanelUserList.setVisible(true);
            jpanelEmpAdd.setVisible(false);
            jpanelEmpList.setVisible(false);
            jPanelProList.setVisible(false);
            jpanelEditPro.setVisible(false);
            jpanelAddProduct.setVisible(false);

            jpanelUserList.removeAll();

            sNameLabel.setBounds(20, 50, 50,25);
            sNameLabel.setForeground(Color.lightGray);
            sDobLabel.setBounds(80, 50, 70,25);
            sDobLabel.setForeground(Color.lightGray);
            sEmailLabel.setBounds(170, 50, 120,25);
            sEmailLabel.setForeground(Color.lightGray);
            sPhoneNumberLabel.setBounds(300, 50, 100,25);
            sPhoneNumberLabel.setForeground(Color.lightGray);
            sPasswordLabel.setBounds(410, 50, 70,25);
            sPasswordLabel.setForeground(Color.lightGray);
            sGenderLabel.setBounds(500, 50, 50,25);
            sGenderLabel.setForeground(Color.lightGray);
            sMemberShipTypeLabel.setBounds(570, 50, 100,25);
            sMemberShipTypeLabel.setForeground(Color.lightGray);
            sBalanceLabel.setBounds(680,50,50,25);
            sBalanceLabel.setForeground(Color.lightGray);
            

            jpanelUserList.add(sNameLabel);
            jpanelUserList.add(sDobLabel);
            jpanelUserList.add(sEmailLabel);
            jpanelUserList.add(sPhoneNumberLabel);
            jpanelUserList.add(sPasswordLabel);
            jpanelUserList.add(sGenderLabel);
            jpanelUserList.add(sMemberShipTypeLabel);
            jpanelUserList.add(sBalanceLabel);

            userList = us.showInfo ("1");

            if (userList!= null) {


                int y = 50;

                for (User u:userList) {

                    JLabel uname = new JLabel(u. getName());
                    JLabel udob = new JLabel(u.getDateOfBirth());
                    JLabel uemail = new JLabel(u.getEmail());
                    JLabel uph = new JLabel(u.getPhoneNumber() );
                    JLabel upass = new JLabel(u.getPassword());
                    JLabel ugender = new JLabel(u.getGender() );
                    JLabel umt = new JLabel(u.getMembershipType() );
                    JLabel ubalance = new JLabel(u.getBalance());


                    y = y+20;

                    uname.setBounds(20, y+10, 50,25);
                    uname.setForeground(Color.lightGray);
                    jpanelUserList.add(uname);
                    udob.setBounds(80, y+10, 70,25);
                    udob.setForeground(Color.lightGray);
                    jpanelUserList.add(udob);
                    uemail.setBounds(170, y+10, 120,25);
                    uemail.setForeground(Color.lightGray);
                    jpanelUserList.add(uemail);
                    uph.setBounds(300, y+10, 100,25);
                    uph.setForeground(Color.lightGray);
                    jpanelUserList.add(uph);
                    upass.setBounds(410, y+10, 70,25);
                    upass.setForeground(Color.lightGray);
                    jpanelUserList.add(upass);
                    ugender.setBounds(500, y+10, 50,25);
                    ugender.setForeground(Color.lightGray);
                    jpanelUserList.add(ugender);
                    umt.setBounds(570, y+10, 100,25);
                    umt.setForeground(Color.lightGray);
                    jpanelUserList.add(umt);
                    ubalance.setBounds(680,y+10,50,25);
                    ubalance.setForeground(Color.lightGray);
                    jpanelUserList.add(ubalance);

                    uname=udob=uemail=uph=upass=ugender=umt=ubalance=null;

                }
                y=0;
                userList.clear();
            }

        }



        else if (e.getSource() == addEmployeeButton) {

            jpanelAdd.setVisible(false);
            jpanelEdit.setVisible(false);
            jpanelDelete.setVisible(false);
            jpanelSearch.setVisible(false);
            jpanelUserList.setVisible(false);
            jpanelEmpAdd.setVisible(true);
            jpanelEmpList.setVisible(false);
            jPanelProList.setVisible(false);
            jpanelEditPro.setVisible(false);
            jpanelAddProduct.setVisible(false);


            sNameLabel.setBounds(200, 50, 150,25);
            sNameLabel.setForeground(Color.lightGray);
            sDobLabel.setBounds(200, 100, 150,25);
            sDobLabel.setForeground(Color.lightGray);
            sEmailLabel.setBounds(200, 150, 150,25);
            sEmailLabel.setForeground(Color.lightGray);
            sPhoneNumberLabel.setBounds(200, 200, 150,25);
            sPhoneNumberLabel.setForeground(Color.lightGray);
            sPasswordLabel.setBounds(200, 250, 150,25);
            sPasswordLabel.setForeground(Color.lightGray);
            sConfirmPasswordLabel.setBounds(200, 300, 150,25);
            sConfirmPasswordLabel.setForeground(Color.lightGray);
            sGenderLabel.setBounds(200, 350, 150,25);
            sGenderLabel.setForeground(Color.lightGray);
            //sMemberShipTypeLabel.setBounds(200, 400, 150,25);

            addempNameTextField.setBounds(400, 50, 150,25);
            addempDobTextField.setBounds(400, 100, 150,25);
            addempEmailTextField.setBounds(400, 150, 150,25);
            addempPhoneNumberTextField.setBounds(400, 200, 150,25);
            addempPasswordField.setBounds(400, 250, 150,25);
            addempConfirmPasswordField.setBounds(400, 300, 150,25);

            sMaleRadioButton.setBounds(400, 350, 70,25);
            sFemaleRadioButton.setBounds(480, 350, 70,25);
            // sRegularRadioButton.setBounds(400, 400, 70,25);
            // sPremiumRadioButton.setBounds(480, 400, 80,25);
            adde.setBounds(400, 400, 150, 25);
            adde.setForeground(Color.lightGray);
            adde.setBackground(Color.black);

            sGenderbButtonGroup.add(sMaleRadioButton);
            sGenderbButtonGroup.add(sFemaleRadioButton);
            // sMemberShipTypeButtonGroup.add(sRegularRadioButton);
            // sMemberShipTypeButtonGroup.add(sPremiumRadioButton);

            jpanelEmpAdd.add(sNameLabel);
            jpanelEmpAdd.add(sDobLabel);
            jpanelEmpAdd.add(sEmailLabel);
            jpanelEmpAdd.add(sPhoneNumberLabel);
            jpanelEmpAdd.add(sPasswordLabel);
            jpanelEmpAdd.add(sConfirmPasswordLabel);
            jpanelEmpAdd.add(sGenderLabel);
            //jpanelAdd.add(sMemberShipTypeLabel);

            jpanelEmpAdd.add(addempNameTextField);
            jpanelEmpAdd.add(addempDobTextField);
            jpanelEmpAdd.add(addempEmailTextField);
            jpanelEmpAdd.add(addempPhoneNumberTextField);
            jpanelEmpAdd.add(addempPasswordField);
            jpanelEmpAdd.add(addempConfirmPasswordField);
            jpanelEmpAdd.add(sMaleRadioButton);
            jpanelEmpAdd.add(sFemaleRadioButton);
            // jpanelAdd.add(sRegularRadioButton);
            // jpanelAdd.add(sPremiumRadioButton);
            jpanelEmpAdd.add(adde);

            adde.addActionListener(new ActionListener(){
            
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (addempNameTextField.getText().equals("") || addempDobTextField.getText().equals("") || addempEmailTextField.getText().equals("") || addempPhoneNumberTextField.getText().equals("") || addempPasswordField.getText().equals("") || sMaleRadioButton.isSelected() == false && sFemaleRadioButton.isSelected() == false || addempConfirmPasswordField.getText().equals("")   ) {

                        JOptionPane.showMessageDialog(jpanelEmpAdd, "Fill up the form properly", "Notification", JOptionPane.ERROR_MESSAGE);
                    }

                    else {

                        emp.setName(addempNameTextField.getText());
                        emp.setDateOfBirth(addempDobTextField.getText());
                        emp.setEmail(addempEmailTextField.getText());
                        emp.setPhoneNumber(addempPhoneNumberTextField.getText());
                        emp.setPassword(addempPasswordField.getText());
    
                        if (sMaleRadioButton.isSelected() == true) {
                            emp.setGender(sMaleRadioButton.getText());
                        }
    
                        else if (sFemaleRadioButton.isSelected() == true ) {
    
                            emp.setGender(sFemaleRadioButton.getText());
                        }
    
                      
    
                        if (es.addNewEmp (emp)) {
                            JOptionPane.showMessageDialog(jpanelEmpAdd, "Employee Added", "Message", JOptionPane.INFORMATION_MESSAGE);
                            addempNameTextField.setText("");
                            addempDobTextField.setText("");
                            addempEmailTextField.setText("");
                            addempPhoneNumberTextField.setText("");
                            addempPasswordField.setText("");
                            addempConfirmPasswordField.setText("");
                            sMaleRadioButton.setSelected(false);
                            sFemaleRadioButton.setSelected(false);;
                        }
                    }
 

                    
                }
            });

            
        }


        else if (e.getSource() == empListButton) {

            jpanelAdd.setVisible(false);
            jpanelEdit.setVisible(false);
            jpanelDelete.setVisible(false);
            jpanelSearch.setVisible(false);
            jpanelUserList.setVisible(false);
            jpanelEmpAdd.setVisible(false);
            jpanelEmpList.setVisible(true);
            jPanelProList.setVisible(false);
            jpanelEditPro.setVisible(false);
            jpanelAddProduct.setVisible(false);

            jpanelEmpList.removeAll();

            eNameLabel.setBounds(20, 50, 50,25);
            eNameLabel.setForeground(Color.lightGray);
            eDobLabel.setBounds(90, 50, 70,25);
            eDobLabel.setForeground(Color.lightGray);
            eEmailLabel.setBounds(180, 50, 120,25);
            eEmailLabel.setForeground(Color.lightGray);
            ePhoneNumberLabel.setBounds(320, 50, 100,25);
            ePhoneNumberLabel.setForeground(Color.lightGray);
            ePasswordLabel.setBounds(440, 50, 100,25);
            ePasswordLabel.setForeground(Color.lightGray);
            eGenderLabel.setBounds(560, 50, 50,25);
            eGenderLabel.setForeground(Color.lightGray);
            eMemberShipTypeLabel.setBounds(630, 50, 100,25);
            eMemberShipTypeLabel.setForeground(Color.lightGray);

            jpanelEmpList.add(eNameLabel);
            jpanelEmpList.add(eDobLabel);
            jpanelEmpList.add(eEmailLabel);
            jpanelEmpList.add(ePhoneNumberLabel);
            jpanelEmpList.add(ePasswordLabel);
            jpanelEmpList.add(eGenderLabel);
            jpanelEmpList.add(eMemberShipTypeLabel);


            empList = es.showInfo ("2");

            if (empList!= null) {


                int y = 50;

                for (Employee em:empList) {

                    JLabel ename = new JLabel(em. getName());
                    JLabel edob = new JLabel(em.getDateOfBirth());
                    JLabel eemail = new JLabel(em.getEmail());
                    JLabel eph = new JLabel(em.getPhoneNumber() );
                    JLabel epass = new JLabel(em.getPassword());
                    JLabel egender = new JLabel(em.getGender() );
                    JLabel emt = new JLabel(em.getMembershipType() );

                    y = y+20;

                    ename.setBounds(20, y+10, 50,25);
                    ename.setForeground(Color.lightGray);
                    jpanelEmpList.add(ename);
                    edob.setBounds(90, y+10, 70,25);
                    edob.setForeground(Color.lightGray);
                    jpanelEmpList.add(edob);
                    eemail.setBounds(180, y+10, 120,25);
                    eemail.setForeground(Color.lightGray);
                    jpanelEmpList.add(eemail);
                    eph.setBounds(320, y+10, 100,25);
                    eph.setForeground(Color.lightGray);
                    jpanelEmpList.add(eph);
                    epass.setBounds(440, y+10, 100,25);
                    epass.setForeground(Color.lightGray);
                    jpanelEmpList.add(epass);
                    egender.setBounds(560, y+10, 50,25);
                    egender.setForeground(Color.lightGray);
                    jpanelEmpList.add(egender);
                    emt.setBounds(630, y+10, 100,25);
                    emt.setForeground(Color.lightGray);
                    jpanelEmpList.add(emt);

                    ename=edob=eemail=eph=epass=egender=emt=null;

                }
                y=0;
                empList.clear();
            }

        }


        
        else if (e.getSource() == showProductButton) {
            jpanelAdd.setVisible(false);
            jpanelEdit.setVisible(false);
            jpanelDelete.setVisible(false);
            jpanelSearch.setVisible(false);
            jpanelUserList.setVisible(false);
            jpanelEmpAdd.setVisible(false);
            jpanelEmpList.setVisible(false);
            jPanelProList.setVisible(true);
            jpanelEditPro.setVisible(false);
            jpanelAddProduct.setVisible(false);

            jPanelProList.removeAll();

            pnameLabel.setBounds(20, 50, 100,25);
            pnameLabel.setForeground(Color.lightGray);
            pPriceLabel.setBounds(160, 50, 60,25); 
            pPriceLabel.setForeground(Color.lightGray);
            pTypeLabel.setBounds(240, 50, 100,25);
            pTypeLabel.setForeground(Color.lightGray);
            pDescriptionLabel.setBounds(340, 50, 200,25);
            pDescriptionLabel.setForeground(Color.lightGray);

            jPanelProList.add(pnameLabel);
            jPanelProList.add(pPriceLabel);
            jPanelProList.add(pTypeLabel);
            jPanelProList.add(pDescriptionLabel);

            pList = ps.showInfo ();

            if (pList!= null) {


                int y = 50;

                for (Product p:pList) {
                    
                    JLabel pname = new JLabel(p.getName());
                    JLabel pprice = new JLabel(p.getPrice());
                    JLabel ptype = new JLabel(p.getType());
                    JLabel pdescription = new JLabel(p.getDescription() );
            
                    y = y+20;

                    pname.setBounds(20, y+20, 100,25);
                    pname.setForeground(Color.lightGray);
                    jPanelProList.add(pname);
                    pprice.setBounds(160, y+20, 60,25);
                    pprice.setForeground(Color.lightGray);
                    jPanelProList.add(pprice);
                    ptype.setBounds(240, y+20, 100,25);
                    ptype.setForeground(Color.lightGray);
                    jPanelProList.add(ptype);
                    pdescription.setBounds(340, y+20, 200,25);
                    pdescription.setForeground(Color.lightGray);
                    jPanelProList.add(pdescription);
                   
                    pname=pprice=ptype=pdescription=null;

                }
                y=0;
                pList.clear();
            }

        }

        else if (e.getSource() == editProductButton) {

            jpanelAdd.setVisible(false);
            jpanelEdit.setVisible(false);
            jpanelDelete.setVisible(false);
            jpanelSearch.setVisible(false);
            jpanelUserList.setVisible(false);
            jpanelEmpAdd.setVisible(false);
            jpanelEmpList.setVisible(false);
            jPanelProList.setVisible(false);
            jpanelEditPro.setVisible(true);
            jpanelAddProduct.setVisible(false);

            pnameLabel.setBounds(200, 50, 150,25);
            pnameLabel.setForeground(Color.lightGray);
            pPriceLabel.setBounds(200, 150, 150,25);
            pPriceLabel.setForeground(Color.lightGray);
            pTypeLabel.setBounds(200, 100, 150,25);
            pTypeLabel.setForeground(Color.lightGray);
            pDescriptionLabel.setBounds(200, 200, 150,25);
            pDescriptionLabel.setForeground(Color.lightGray);

            pnameTextField.setBounds(400, 50, 150,25);
            pPriceTextField.setBounds(400, 150, 150,25);
            pTypeTextField.setBounds(400, 100, 150,25);
            pDescriptionTextField.setBounds(400, 200, 200,25);
           
            jpanelEditPro.add(pnameLabel);
            jpanelEditPro.add(pPriceLabel);
            jpanelEditPro.add(pTypeLabel);
            jpanelEditPro.add(pDescriptionLabel);
            jpanelEditPro.add(pnameTextField);
            jpanelEditPro.add(pPriceTextField);
            jpanelEditPro.add(pTypeTextField);
            jpanelEditPro.add(pDescriptionTextField);

            

            searchp.setBounds(600, 50, 100, 25);
            searchp.setForeground(Color.lightGray);
            searchp.setBackground(Color.black);
            jpanelEditPro.add(searchp);

            savep.setBounds(400, 270, 150, 25);
            savep.setForeground(Color.lightGray);
            savep.setBackground(Color.black);
            jpanelEditPro.add(savep);

            searchp.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e) {
                    
                    pro = ps.searchProduct (pnameTextField.getText());
                    if(pro == null) {

                        JOptionPane.showMessageDialog(jpanelEditPro,"Product Not Found", "Not Found", JOptionPane.INFORMATION_MESSAGE);
                    }

                    else {

                        pnameTextField.setText(pro.getName());
                        pPriceTextField.setText(pro.getPrice());
                        pTypeTextField.setText(pro.getType());
                        pDescriptionTextField.setText(pro.getDescription());
                    
                    


                    } 
                }
            });

            savep.addActionListener(new ActionListener(){
            
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (pnameTextField.getText().equals("") || pPriceTextField.getText().equals("") || pTypeTextField.getText().equals("") || pDescriptionTextField.getText().equals("")  ) {

                        JOptionPane.showMessageDialog(jpanelEditPro, "Fill up the form properly", "Notification", JOptionPane.ERROR_MESSAGE);
                    }
            
                  else {

                    pro.setName (pnameTextField.getText());
                    pro.setPrice(pPriceTextField.getText());
                    pro.setType(pTypeTextField.getText());
                    pro.setDescription(pDescriptionTextField.getText());
 
                    if(ps.editProduct(pro)){
                     
                        JOptionPane.showMessageDialog(jpanelEditPro, "Product Information Updated", "Message", JOptionPane.INFORMATION_MESSAGE);    

                        pnameTextField.setText("");
                        pTypeTextField.setText("");
                        pPriceTextField.setText("");
                        pDescriptionTextField.setText("");
                    }

                 else{
                     
                     JOptionPane.showMessageDialog(jpanelEditPro, "Product Information can not be Updated", "Error", JOptionPane.ERROR_MESSAGE);
                 }

                  }
                    


                }
            });


        }

        else if (e.getSource() == addproduct ) {

            jpanelAdd.setVisible(false);
            jpanelEdit.setVisible(false);
            jpanelDelete.setVisible(false);
            jpanelSearch.setVisible(false);
            jpanelUserList.setVisible(false);
            jpanelEmpAdd.setVisible(false);
            jpanelEmpList.setVisible(false);
            jPanelProList.setVisible(false);
            jpanelEditPro.setVisible(false);
            jpanelAddProduct.setVisible(true);

            
            pnameLabel.setBounds(200, 50, 150,25);
            pnameLabel.setForeground(Color.lightGray);
            pPriceLabel.setBounds(200, 150, 150,25);
            pPriceLabel.setForeground(Color.lightGray);
            pTypeLabel.setBounds(200, 100, 150,25);
            pTypeLabel.setForeground(Color.lightGray);
            pDescriptionLabel.setBounds(200, 200, 150,25);
            pDescriptionLabel.setForeground(Color.lightGray);

            addpnameTextField.setBounds(400, 50, 150,25);
            addpPriceTextField.setBounds(400, 150, 150,25);
            addpTypeTextField.setBounds(400, 100, 150,25);
            addpDescriptionTextField.setBounds(400, 200, 200,25);
           
            jpanelAddProduct.add(pnameLabel);
            jpanelAddProduct.add(pPriceLabel);
            jpanelAddProduct.add(pTypeLabel);
            jpanelAddProduct.add(pDescriptionLabel);
            jpanelAddProduct.add(addpnameTextField);
            jpanelAddProduct.add(addpPriceTextField);
            jpanelAddProduct.add(addpTypeTextField);
            jpanelAddProduct.add(addpDescriptionTextField);

            saveProduct.setBounds(400, 270, 150, 25);
            saveProduct.setForeground(Color.lightGray);
            saveProduct.setBackground(Color.black);
            jpanelAddProduct.add(saveProduct);


            saveProduct.addActionListener(new ActionListener(){
            
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (addpnameTextField.getText().equals("") || addpPriceTextField.getText().equals("") || addpTypeTextField.getText().equals("") || addpDescriptionTextField.getText().equals("")  ) {

                        JOptionPane.showMessageDialog(jpanelAddProduct, "Fill up the form properly", "Notification", JOptionPane.ERROR_MESSAGE);
                    }
            
                  else {

                    pro.setName (addpnameTextField.getText());
                    pro.setPrice(addpPriceTextField.getText());
                    pro.setType(addpTypeTextField.getText());
                    pro.setDescription(addpDescriptionTextField.getText());
 
                    if(ps.addNewProduct(pro)){
                     JOptionPane.showMessageDialog(jpanelAddProduct, "Product Added", "Message", JOptionPane.INFORMATION_MESSAGE);  

                        addpnameTextField.setText("");
                        addpPriceTextField.setText("");
                        addpTypeTextField.setText("");
                        addpDescriptionTextField.setText("");
                     
                    }

                 else{
                     
                     JOptionPane.showMessageDialog(jpanelAddProduct, "Product can not be Added", "Error", JOptionPane.ERROR_MESSAGE);
                 }

                  }
                    


                }
            });


        }
        
       

    }
}





