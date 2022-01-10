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
import java.util.*;

import entity.Product;
import service.ProductServices;
import service.UserServices;
import entity.User;


public class UserHome extends JFrame implements ActionListener {

   public static String s1;

    User user = new User();
    UserServices us = new UserServices ();

    Product pro = new Product();
    ProductServices ps = new ProductServices();
    List <Product> pList = new ArrayList<Product>();

    JLabel userPanelLabel = new JLabel("User Panel");
    JPanel jp1 = new JPanel();
    JPanel JpanelShowProduct = new JPanel();
    JPanel JpanelBuyProduct = new JPanel();

    JButton showStatusButton = new JButton("Show Status");
    JButton showProductButton = new JButton("Show Products");
    JButton buyProductButton = new JButton("Buy");

    JLabel sNameLabel = new JLabel("Name");
    JLabel sDobLabel = new JLabel("Date of Birth");
    JLabel sEmailLabel = new JLabel("Email");
    JLabel sPasswordLabel = new JLabel("Password");
    JLabel sConfirmPasswordLabel = new JLabel("Confirm Password");
    JLabel sGenderLabel = new JLabel("Gender");
    JLabel sMemberShipTypeLabel = new JLabel("MemberShipType");
    JLabel sPhoneNumberLabel = new JLabel("Phone Number");
    JLabel pnameLabel = new JLabel("Name");
    JLabel pPriceLabel = new JLabel("Price");
    JLabel pTypeLabel = new JLabel("Type");
    JLabel pDescriptionLabel = new JLabel("Description");

    JTextField sNameTextField = new JTextField();
    JTextField sDobTextField = new JTextField();
    JTextField sEmailTextField = new JTextField();
    JTextField sPhoneNumberTextField = new JTextField();
    JTextField sPasswordField = new JTextField();
    JTextField sConfirmPasswordField = new JTextField();
    JTextField pnameTextField = new JTextField();
    JTextField pPriceTextField = new JTextField();
    JTextField pTypeTextField = new JTextField();
    JTextField pDescriptionTextField = new JTextField();

    JButton search = new JButton("Search");
    JButton purchase = new JButton("Purchase");

    public UserHome () {

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

        JpanelShowProduct.setBounds(200,100,800,600);
        JpanelShowProduct.setBackground(Color.black);
        JpanelShowProduct.setLayout(null);
        this.add(JpanelShowProduct);

        JpanelBuyProduct.setBounds(200,100,800,600);
        JpanelBuyProduct.setBackground(Color.black);
        JpanelBuyProduct.setLayout(null);
        this.add(JpanelBuyProduct);

        userPanelLabel.setBounds(450,50, 200,25);
        userPanelLabel.setFont(new Font("serif",Font.BOLD,20));
        userPanelLabel.setForeground(Color.lightGray);
        this.add(userPanelLabel);

        showStatusButton.setBounds(20, 150, 150, 25);
        showStatusButton.setForeground(Color.lightGray);
        showStatusButton.setBackground(Color.black);
        this.add(showStatusButton);
        showStatusButton.addActionListener(this);

        showProductButton.setBounds(20, 210, 150, 25);
        showProductButton.setForeground(Color.lightGray);
        showProductButton.setBackground(Color.black);
        this.add(showProductButton);
        showProductButton.addActionListener(this);

        buyProductButton.setBounds(20, 270, 150, 25);
        buyProductButton.setForeground(Color.lightGray);
        buyProductButton.setBackground(Color.black);
        this.add(buyProductButton);
        buyProductButton.addActionListener(this);

        jp1.setVisible(false);
        JpanelShowProduct.setVisible(false);
        JpanelBuyProduct.setVisible(false);

        
    }

    @Override
        public void actionPerformed (ActionEvent e ) {

            if (e.getSource() == showStatusButton) {

                jp1.setVisible(true);
                JpanelShowProduct.setVisible(false);
                JpanelBuyProduct.setVisible(false);

                
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
            
            user = us.searchUser (s1);
                        if(user == null) {
    
                            JOptionPane.showMessageDialog(jp1,"User Not Found", "Not Found", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
    
                            sNameTextField.setText(user.getName());
                            sDobTextField.setText(user.getDateOfBirth());
                            sPhoneNumberTextField.setText(user.getPhoneNumber());
                            sPasswordField.setText(user.getPassword());
                            sConfirmPasswordField.setText(user.getPassword());
                            sEmailTextField.setText(user.getEmail());
    
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

            else if (e.getSource() == showProductButton) {

                jp1.setVisible(false);
                JpanelShowProduct.setVisible(true);
                JpanelBuyProduct.setVisible(false);
    
                JpanelShowProduct.removeAll();
    
                pnameLabel.setBounds(20, 50, 100,25);
                pnameLabel.setForeground(Color.lightGray);
                pPriceLabel.setBounds(160, 50, 60,25); 
                pPriceLabel.setForeground(Color.lightGray);
                pTypeLabel.setBounds(240, 50, 100,25);
                pTypeLabel.setForeground(Color.lightGray);
                pDescriptionLabel.setBounds(340, 50, 200,25);
                pDescriptionLabel.setForeground(Color.lightGray);
    
                JpanelShowProduct.add(pnameLabel);
                JpanelShowProduct.add(pPriceLabel);
                JpanelShowProduct.add(pTypeLabel);
                JpanelShowProduct.add(pDescriptionLabel);
    
                pList = ps.showInfo ();
    
                if (pList!= null) {
    
    
                    int y = 50;
    
                    for (Product p:pList) {
                        
                        JLabel name = new JLabel(p.getName());
                        JLabel price = new JLabel(p.getPrice());
                        JLabel type = new JLabel(p.getType());
                        JLabel description = new JLabel(p.getDescription() );
                
                        y = y+20;
    
                        name.setBounds(20, y+20, 100,25);
                        name.setForeground(Color.lightGray);
                        JpanelShowProduct.add(name);
                        price.setBounds(160, y+20, 60,25);
                        price.setForeground(Color.lightGray);
                        JpanelShowProduct.add(price);
                        type.setBounds(240, y+20, 100,25);
                        type.setForeground(Color.lightGray);
                        JpanelShowProduct.add(type);
                        description.setBounds(340, y+20, 200,25);
                        description.setForeground(Color.lightGray);
                        JpanelShowProduct.add(description);
                       
                        name=price=type=description=null;
    
                    }
                    y=0;
                    pList.clear();
                }
    
            }

            else if (e.getSource() == buyProductButton) {

                jp1.setVisible(false);
                JpanelShowProduct.setVisible(false);
                JpanelBuyProduct.setVisible(true);
    
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
               
                JpanelBuyProduct.add(pnameLabel);
                JpanelBuyProduct.add(pPriceLabel);
                JpanelBuyProduct.add(pTypeLabel);
                JpanelBuyProduct.add(pDescriptionLabel);
                JpanelBuyProduct.add(pnameTextField);
                JpanelBuyProduct.add(pPriceTextField);
                JpanelBuyProduct.add(pTypeTextField);
                JpanelBuyProduct.add(pDescriptionTextField);
    
                
    
                search.setBounds(600, 50, 100, 25);
                search.setForeground(Color.lightGray);
                search.setBackground(Color.black);
                JpanelBuyProduct.add(search);

                purchase.setBounds(400, 270, 150, 25);
                purchase.setForeground(Color.lightGray);
                purchase.setBackground(Color.black);
                JpanelBuyProduct.add(purchase);
    
                search.addActionListener(new ActionListener(){
                @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        pro = ps.searchProduct (pnameTextField.getText());
                        if(pro == null) {
    
                            JOptionPane.showMessageDialog(JpanelBuyProduct,"Product Not Found", "Not Found", JOptionPane.INFORMATION_MESSAGE);
                        }
    
                        else {
    
                            pnameTextField.setText(pro.getName());
                            pPriceTextField.setText(pro.getPrice());
                            pTypeTextField.setText(pro.getType());
                            pDescriptionTextField.setText(pro.getDescription());
                        
                        
    
    
                        } 
                    }
                });

                purchase.addActionListener(new ActionListener(){
                
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int i= JOptionPane.showConfirmDialog(JpanelBuyProduct, "Are you sure?", "Buy", JOptionPane.YES_NO_CANCEL_OPTION);

                        try {
                            if(i==0){
                                user = us.searchUser (s1);
                                if (user.getMembershipType().equals(pTypeTextField.getText()) || user.getMembershipType().equals("Premium") ) {
        
                               double  d1 = Double.parseDouble(pPriceTextField.getText());
                               double  d2 = Double.parseDouble(user.getBalance());
                               double  d3 = d2-d1;
        
                                String val = Double.toString(d3);
        
                                user.setBalance(val);
                                us.editUser(user);
                                JOptionPane.showMessageDialog(JpanelBuyProduct, "Product Purchased");
                                
    
                                }
    
                                else{
                                    JOptionPane.showMessageDialog(JpanelBuyProduct, "Unable To Buy");
                                }
    
                                
                            }

                        } catch (Exception t) {
                            System.out.print(t);
                        }


                        


                    }
                });
    
    
            }

















        }

       /* public static void main(String[] args) {
            
            UserHome uh = new UserHome();
        } */

}