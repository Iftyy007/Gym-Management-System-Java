package userinterface;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import service.*;



public class Login extends JFrame implements ActionListener{
    JLabel jLabel=new JLabel("Login Form");
    JLabel loginEmail=new JLabel("Email:");
    JLabel loginPassword=new JLabel("Password:");
    JTextField loginEmailtextf=new JTextField();
    JPasswordField loginPasswordtextf=new JPasswordField();
    JButton loginbtn=new JButton("Login");
    JButton signupbtn=new JButton("Signup");
    public Login() {
        this.setSize(1000,700);
        this.getContentPane().setBackground(Color.BLACK);
        this.setTitle("Login");
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        jLabel.setBounds(510, 110, 100, 30);
        jLabel.setFont(new Font("serif",Font.BOLD,20));
        jLabel.setForeground(Color.lightGray);
        loginEmail.setBounds(390,200,100,20);
        loginEmail.setForeground(Color.lightGray);
        loginEmailtextf.setBounds(490,200,150,25);
        loginPassword.setBounds(390,250,100,25);
        loginPassword.setForeground(Color.lightGray);
        loginPasswordtextf.setBounds(490,250,150,25);

        loginbtn.setBounds(525,300,80,25);
        loginbtn.setForeground(Color.lightGray);
        loginbtn.setBackground(Color.black);
        signupbtn.setBounds(525,350,80,25);
        signupbtn.setForeground(Color.lightGray);
        signupbtn.setBackground(Color.black);
        
        this.add(jLabel);
        this.add(loginEmail);
        this.add(loginPassword);
        this.add(loginEmailtextf);
        this.add(loginPasswordtextf);
        this.add(loginbtn);
        this.add(signupbtn);

        loginbtn.addActionListener(this);
        signupbtn.addActionListener(this);
    }

        @Override
        public void actionPerformed(ActionEvent e){
            
            if (e.getSource() == signupbtn) {

                SignUp su = new SignUp();
                this.dispose();
            }

            else if (e.getSource() == loginbtn) {

                LoginServices ls = new LoginServices();

                if (ls.getValidation(loginEmailtextf.getText(), loginPasswordtextf.getText()) == 0 ) {

                    this.dispose();
                    AdminHome ah = new AdminHome ();
                }

               else if (ls.getValidation(loginEmailtextf.getText(), loginPasswordtextf.getText()) == 1 ) {
                    this.dispose();
                    UserHome.s1 = loginEmailtextf.getText();
                    UserHome uh = new UserHome();
                    

                }

                else if (ls.getValidation(loginEmailtextf.getText(), loginPasswordtextf.getText()) == 2 ) {
                    this.dispose();
                    EmployeeHome.s1 = loginEmailtextf.getText();
                    EmployeeHome eh = new EmployeeHome();
                    

                }

                else if (ls.getValidation(loginEmailtextf.getText(), loginPasswordtextf.getText()) == 3 ) {

                    JOptionPane.showMessageDialog(this,"Inavlid username and password","Invalid",JOptionPane.ERROR_MESSAGE);

                }
            }
            
        }

        
    
    public static void main(String[] args){
         new Login();
        
	    
    }

}