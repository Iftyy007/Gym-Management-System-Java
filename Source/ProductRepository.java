package repository;
import entity.Product;
import java.sql.*;
import java.util.*;

public class ProductRepository {

    Connection c;
    Statement s;
    ResultSet r;

    Product pro = new Product();
    List <Product> pList = new ArrayList<Product>();

    
    public ProductRepository () {

        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb", "root", "");
            s = c.createStatement();

        } catch (SQLException e) {

            System.out.println(e);
        }
    }

    public boolean addNewProductToDatabase (Product pro) 
    {
        int i = 0;

        try {
            i = s.executeUpdate("INSERT INTO product (name,price,type,description) VALUES ('"+pro.getName()+"','"+pro.getPrice()+"','"+pro.getType()+"','"+pro.getDescription()+"')");

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

    public boolean editProductToDatabase (Product pro) {
        int i= 0;

        try {
            i = s.executeUpdate("UPDATE product SET name='"+pro.getName()+"', price='"+pro.getPrice()+"', type='"+pro.getType()+"', description='"+pro.getDescription()+"' WHERE name='"+pro.getName()+"' ");

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

    public boolean deleteProductFromDatabase (String name) {

        int i = 0;

        try {

            i = s.executeUpdate("DELETE FROM product WHERE name='"+name+"'  ");

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

    public Product searchProductFromDatabase (String name) {

        try {

            r = s.executeQuery("SELECT * FROM product WHERE name='"+name+"'");
            if (r.next()) {

                pro.setName((r.getString("name")));
                pro.setPrice((r.getString("price")));
                pro.setType((r.getString("type")));
                pro.setDescription((r.getString("description")));
                
                return pro;

            }

            else {

                return null;
            }

        } catch (SQLException e) {

            System.out.println(e);
        }

        return null;
      
    }

    
    public List <Product> getAllProductFromDatabase () {

        try {

            r = s.executeQuery("SELECT * FROM product ");
            while (r.next()) {
                 pro = new Product();
                 pro.setName((r.getString("name")));
                 pro.setPrice((r.getString("price")));
                 pro.setType((r.getString("type")));
                 pro.setDescription((r.getString("description")));
                 pList.add(pro);

            }

            return pList;



        } catch (SQLException e) {

            System.out.println(e);
        }

        return null;

    }




}

