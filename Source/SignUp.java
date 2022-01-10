package userinterface;
import javax.swing.*;
import jdk.nashorn.internal.runtime.regexp.joni.Warnings;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import service.UserServices;
import entity.User;
import entity.Employee;


public class SignUp extends JFrame implements ActionListener {

    JLabel sSignUpLabel = new JLabel ("SignUp");
    JLabel sNameLabel = new JLabel("Name");
    JLabel sDobLabel = new JLabel("Date of Birth");
    JLabel sEmailLabel = new JLabel("Email");
    JLabel sPasswordLabel = new JLabel("Password");
    JLabel sConfirmPasswordLabel = new JLabel("Confirm Password");
    JLabel sGenderLabel = new JLabel("Gender");
    JLabel sMemberShipTypeLabel = new JLabel("MemberShipType");

    JLabel sPhoneNumberLabel = new JLabel("Phone Number");
    JButton sSignUpButton = new JButton("Signup");

    JTextField sNameTextField = new JTextField();
    JTextField sDobTextField = new JTextField();
    JTextField sEmailTextField = new JTextField();
    JTextField sPhoneNumberTextField = new JTextField();
    JPasswordField sPasswordField = new JPasswordField();
    JPasswordField sConfirmPasswordField = new JPasswordField();

    JRadioButton sMaleRadioButton = new JRadioButton("Male");
    JRadioButton sFemaleRadioButton = new JRadioButton("Female");
    
    JRadioButton sRegularRadioButton = new JRadioButton("Regular");
    JRadioButton sPremiumRadioButton = new JRadioButton("Premium");

    ButtonGroup sGenderbButtonGroup = new ButtonGroup();
    ButtonGroup sMemberShipTypeButtonGroup = new ButtonGroup();

    public SignUp () {

        this.setTitle("Signup");
        this.getContentPane().setBackground(Color.BLACK);
        //this.setFont(new Font("serif",Font.BOLD,20));
        this.setSize(1000,700);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.add(sSignUpLabel);
        this.add(sNameLabel);
        this.add(sDobLabel);
        this.add(sEmailLabel);
        this.add(sPasswordLabel);
        this.add(sConfirmPasswordLabel);
        this.add(sGenderLabel);
        this.add(sMemberShipTypeLabel);
        this.add(sPhoneNumberLabel);
        this.add(sNameTextField);
        this.add(sDobTextField);
        this.add(sEmailTextField);
        this.add(sPasswordField);
        this.add(sConfirmPasswordField);
        this.add(sPhoneNumberTextField);
        this.add(sSignUpButton);       
        this.add(sMaleRadioButton);
        this.add(sFemaleRadioButton);
        this.add(sRegularRadioButton);
        this.add(sPremiumRadioButton);
        

        sGenderbButtonGroup.add(sMaleRadioButton);
        sGenderbButtonGroup.add(sFemaleRadioButton);
        sMemberShipTypeButtonGroup.add(sRegularRadioButton);
        sMemberShipTypeButtonGroup.add(sPremiumRadioButton);

        sSignUpLabel.setBounds(500, 50, 75, 50);
        sSignUpLabel.setFont(new Font("serif",Font.BOLD,20));
        sSignUpLabel.setForeground(Color.lightGray);

        sNameLabel.setBounds(300, 120, 120, 40);
        sNameLabel.setForeground(Color.lightGray);
        sNameTextField.setBounds(450, 120, 150, 40);

        sDobLabel.setBounds(300, 170, 120, 40);
        sDobLabel.setForeground(Color.lightGray);
        sDobTextField.setBounds(450, 170, 150, 40);
        
        sEmailLabel.setBounds(300, 220, 120, 40);
        sEmailLabel.setForeground(Color.lightGray);
        sEmailTextField.setBounds(450,220,150,40);

        sPhoneNumberLabel.setBounds(300, 270, 120, 40);
        sPhoneNumberLabel.setForeground(Color.lightGray);
        sPhoneNumberTextField.setBounds(450, 270, 150, 40);

        sPasswordLabel.setBounds(300, 320, 120, 40);
        sPasswordLabel.setForeground(Color.lightGray);
        sPasswordField.setBounds(450, 320, 150, 40);

        sConfirmPasswordLabel.setBounds(300, 370, 120, 40);
        sConfirmPasswordLabel.setForeground(Color.lightGray);
        sConfirmPasswordField.setBounds(450, 370, 150, 40);

        sGenderLabel.setBounds(300, 420, 50, 40);
        sGenderLabel.setForeground(Color.lightGray);
        sMemberShipTypeLabel.setBounds(300, 470, 120, 40);
        sMemberShipTypeLabel.setForeground(Color.lightGray);

        sSignUpButton.setBounds(480, 550, 75, 40);
        sSignUpButton.setBackground(Color.black);
        sSignUpButton.setForeground(Color.lightGray);

        sMaleRadioButton.setBounds(450, 420, 80, 40);
        sMaleRadioButton.setForeground(Color.lightGray);
        sMaleRadioButton.setBackground(Color.black);

        sFemaleRadioButton.setBounds(540, 420, 80, 40);
        sFemaleRadioButton.setBackground(Color.black);
        sFemaleRadioButton.setForeground(Color.lightGray);

        sRegularRadioButton.setBounds(450, 470, 80, 40);
        sRegularRadioButton.setBackground(Color.black);
        sRegularRadioButton.setForeground(Color.lightGray);

        sPremiumRadioButton.setBounds(540, 470, 80, 40);
        sPremiumRadioButton.setBackground(Color.black);
        sPremiumRadioButton.setForeground(Color.lightGray);

        sSignUpButton.addActionListener(this);
        sMaleRadioButton.addActionListener(this);
        sFemaleRadioButton.addActionListener(this);
        sRegularRadioButton.addActionListener(this);
        sPremiumRadioButton.addActionListener(this);
       



    }
    
    @Override
    public void actionPerformed (ActionEvent e ) {
        
    if (e.getSource() == sSignUpButton) {
    
    if (sNameTextField.getText().equals("") || sDobTextField.getText().equals("") || sEmailTextField.getText().equals("") || sPhoneNumberTextField.getText().equals("") || sPasswordField.getText().equals("") || sConfirmPasswordField.getText().equals("") || sMaleRadioButton.isSelected()==false && sFemaleRadioButton.isSelected() == false || sRegularRadioButton.isSelected() == false && sPremiumRadioButton.isSelected() == false  ) {

      JOptionPane.showMessageDialog(this, "Fill up the form properly", "Notification", JOptionPane.ERROR_MESSAGE);
    }

    else {
      String s1;
      String s2;
  
      if (sMaleRadioButton.isSelected() == true) {
        s1 = sMaleRadioButton.getText();
      }
      else {
        s1 = sFemaleRadioButton.getText();
      }
  
      if (sRegularRadioButton.isSelected() == true) {
        s2 = sRegularRadioButton.getText();
      }
      else {
        s2 = sPremiumRadioButton.getText();
      }
  
        UserServices us = new UserServices();
        User user = new User(new String [] {sNameTextField.getText(),sDobTextField.getText(),sEmailTextField.getText(),sPhoneNumberTextField.getText(),sPasswordField.getText(),s1,s2} );
          
        if (us.addNewUser(user)) {
          JOptionPane.showMessageDialog(this, "User Registered.", "Notification", JOptionPane.INFORMATION_MESSAGE);
          this.dispose(); 
          //new Login();
           
  
        }

    }

    
   


    }

   

    }

}