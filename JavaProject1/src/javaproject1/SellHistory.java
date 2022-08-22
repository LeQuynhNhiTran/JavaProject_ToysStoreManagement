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
public class SellHistory {
    private String shID, pdName, cate, empName;
    private int unit;
    protected double price;

    public SellHistory(String EmpID) {
        this.shID = shID;
    }
        
    
    public SellHistory() {
        this.shID = "";
        this.pdName = "";
        this.cate = "";
        this.empName = "";
        this.unit = 0;
        this.price = 0.2f;
    }

    public SellHistory(String shID, String pdName, String cate, String empName, int unit, double price) {
        this.shID = shID;
        this.pdName = pdName;
        this.cate = cate;
        this.empName = empName;
        this.unit = unit;
        this.price = price;
    }    

    public String getShID() {
        return shID;
    }

    public void setShID(String shID) {
        this.shID = shID;
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
    
     public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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
        return shID + "/" + pdName + "/" + cate + "/" + empName + "/" + unit + "/" + price;
    }

}
