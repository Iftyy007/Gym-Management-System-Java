package userinterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

import service.EmployeeServices;
import entity.Employee;

public class EmployeeHome extends JFrame implements ActionListener {

    public static String s1;

    Employee emp = new Employee();
    EmployeeServices es = new EmployeeServices ();

    JLabel userPanelLabel = new JLabel("Employee Panel");
    JPanel jp1 = new JPanel();
    JButton showStatusButton = new JButton("Show Status");

    JLabel sNameLabel = new JLabel("Name");
    JLabel sDobLabel = new JLabel("Date of Birth");
    JLabel sEmailLabel = new JLabel("Email");
    JLabel sPasswordLabel = new JLabel("Password");
    JLabel sConfirmPasswordLabel = new JLabel("Confirm Password");
    JLabel sGenderLabel = new JLabel("Gender");
    JLabel sMemberShipTypeLabel = new JLabel("Type");
    JLabel sPhoneNumberLabel = new JLabel("Phone Number");

    JTextField sNameTextField = new JTextField();
    JTextField sDobTextField = new JTextField();
    JTextField sEmailTextField = new JTextField();
    JTextField sPhoneNumberTextField = new JTextField();
    JTextField sPasswordField = new JTextField();
    JTextField sConfirmPasswordField = new JTextField();

    public EmployeeHome () {

        this.setSize(1000,700);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("User Panel");
        //this.setFont(new Font("serif",Font.BOLD,20));

        jp1.setBounds(200,100,800,600);
        jp1.setBackground(Color.black);
        jp1.setLayout(null);
        this.add(jp1);

        userPanelLabel.setBounds(450,50, 200,25);
        userPanelLabel.setFont(new Font("serif",Font.BOLD,20));
        userPanelLabel.setForeground(Color.lightGray);
        this.add(userPanelLabel);

        showStatusButton.setBounds(20, 150, 150, 25);
        showStatusButton.setForeground(Color.lightGray);
        showStatusButton.setBackground(Color.black);
        this.add(showStatusButton);
        showStatusButton.addActionListener(this);

        jp1.setVisible(false);

        


    }

    
    @Override
        public void actionPerformed (ActionEvent e ) {

            if (e.getSource() == showStatusButton) {

                jp1.setVisible(true);

                
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

            jp1.add(sNameLabel);
            jp1.add(sDobLabel);
            jp1.add(sEmailLabel);
            jp1.add(sPhoneNumberLabel);
            jp1.add(sPasswordLabel);
            jp1.add(sConfirmPasswordLabel);
            jp1.add(sGenderLabel);
            jp1.add(sMemberShipTypeLabel);

            jp1.add(sNameTextField);
            jp1.add(sDobTextField);
            jp1.add(sEmailTextField);
            jp1.add(sPhoneNumberTextField);
            jp1.add(sPasswordField);
            jp1.add(sConfirmPasswordField);
            // jpanelSearch.add(sMaleRadioButton);
            // jpanelSearch.add(sFemaleRadioButton);
            // jpanelSearch.add(sRegularRadioButton);
            // jpanelSearch.add(sPremiumRadioButton);
            jp1.add(genderTextField);
            jp1.add(membershipTextField);

            emp = es.searchEmp (s1);
            if(emp == null) {

                JOptionPane.showMessageDialog(jp1,"User Not Found", "Not Found", JOptionPane.INFORMATION_MESSAGE);
            }

            else {
    
                sNameTextField.setText(emp.getName());
                sDobTextField.setText(emp.getDateOfBirth());
                sPhoneNumberTextField.setText(emp.getPhoneNumber());
                sPasswordField.setText(emp.getPassword());
                sConfirmPasswordField.setText(emp.getPassword());
                sEmailTextField.setText(emp.getEmail());

                if (emp.getGender().equals("Male")) {
                    //sMaleRadioButton.setSelected(true);
                    genderTextField.setText("Male");
                }
                else {
                    //sFemaleRadioButton.setSelected(true);
                    genderTextField.setText("Female");
                }

                // if (emp.getMembershipType().equals("Regular")) {
                //     //sRegularRadioButton.setSelected(true);
                //     membershipTextField.setText("Regular");
                // }
                // else {

                //     //sPremiumRadioButton.setSelected(true);
                //     membershipTextField.setText("premium");
                // }

                membershipTextField.setText("Employee");


            } 
            

            } 
        }

       

}