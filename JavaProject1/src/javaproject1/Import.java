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
public class Import {
    private String imID, pdName, cate, spName;
    private int unit;
    protected double price;

    public Import(String imID) {
        this.imID = imID;
    }
        
    
    public Import() {
        this.imID = "";
        this.pdName = "";
        this.cate = "";
        this.spName = "";
        this.unit = 0;
        this.price = 0.2f;
    }

    public Import(String shID, String pdName, String cate, String empName, int unit, double price) {
        this.imID = shID;
        this.pdName = pdName;
        this.cate = cate;
        this.spName = empName;
        this.unit = unit;
        this.price = price;
    }    

    public String getImID() {
        return imID;
    }

    public void setImID(String imID) {
        this.imID = imID;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }
    
     public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }
    
    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }
    
     public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return imID + "/" + pdName + "/" + cate + "/" + spName + "/" + unit + "/" + price;
    }
}
