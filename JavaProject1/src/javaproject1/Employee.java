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
public class Employee {
    private String empID, empName, empPhone, position;

    public Employee(String EmpID) {
        this.empID = empID;
    }
        
    
    public Employee() {
        this.empID = "";
        this.empName = "";
        this.empPhone = "";
        this.position = "";
    }

    public Employee(String empID, String empName, String empPhone, String position) {
        this.empID = empID;
        this.empName = empName;
        this.empPhone = empPhone;
        this.position = position;
    }    

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    @Override
    public String toString() {
        return empID + "/" + empName + "/" + empPhone + "/" + position;
    }

}
