package service;
import java.util.*;

import entity.Product;
import repository.ProductRepository;

public class ProductServices {

    Product pro = new Product();
    List <Product> pList = new ArrayList<Product>();
    ProductRepository psrp = new ProductRepository ();

    public boolean addNewProduct (Product pro) {

        return psrp.addNewProductToDatabase (pro);

    }

    public boolean editProduct (Product pro) {

        return psrp.editProductToDatabase (pro);
    }

    public boolean deleteProduct (String name) {

        return psrp.deleteProductFromDatabase (name);
    }

    public Product searchProduct (String name) {

        pro = psrp.searchProductFromDatabase (name);
        return pro;
    }

    public List <Product> showInfo ( ) {

        pList = psrp.getAllProductFromDatabase ();

        return pList;
    }
}