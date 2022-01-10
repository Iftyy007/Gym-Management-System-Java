package entity;

public class Product {

    private String name,price,type,description;

    public Product () {

        this.name = null;
        this.price = null;
        this.type = null;
        this.description = null;

    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getPrice() {
        return price;
    }

   
    public void setPrice(String price) {
        this.price = price;
    }

    
    public String getType() {
        return type;
    }

   
    public void setType(String type) {
        this.type = type;
    }

   
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }
    

}