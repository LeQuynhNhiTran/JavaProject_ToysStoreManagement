/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;

/**
 *
 * @author Zero
 */
public class Product {
    private String pdID, pdName, category;
    private int stock;
    protected double price;
    
    public Product(String pdID)
    {
        this.pdID = pdID;
    }
    
    public Product() {
        this.pdID = "";
        this.pdName = "";
        this.category = "";
        this.price = 0.2f;
        this.stock = 0;
    }
    
    
    public Product(String pdID,String pdName, String category, double price, int stock) {
        this.pdID = pdID;
        this.pdName = pdName;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getPdID() {
        return pdID;
    }

    public void setpdID(String pdID) {
        this.pdID = pdID;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return pdID + "/" + pdName + "/" + category + "/" + price + "/" + stock;
    }
}
