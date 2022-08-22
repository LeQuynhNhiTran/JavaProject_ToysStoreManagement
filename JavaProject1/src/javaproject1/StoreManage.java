/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zero
 */
public class StoreManage {
    List<Employee> listEmployee =new ArrayList<Employee>();  
    List<Product> listProduct =new ArrayList<Product>();
    List<SellHistory> listSell =new ArrayList<SellHistory>();
    List<Import> listImport =new ArrayList<Import>();
    
    public void writeEmployeeToFile(List<Employee> listEmployee){
    try {
        FileWriter fw = new FileWriter("Employee.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(Employee o:listEmployee)
        {
            bw.write(o.toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
    } catch(Exception e){
}
}
    
    public List<Employee> readEmployeeFromFile()
    {
        List<Employee> employee = new ArrayList<>();  
        try{
            FileReader fr = new FileReader("Employee.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while(true){
                line = br.readLine();
                if(line == null){
                    break;
                }
                String txt[] = line.split("/");
                String empID = txt[0];
                String empName = txt[1];
                String empPhone = txt[2];
                String position = txt[3];
                employee.add(new Employee(empID, empName, empPhone, position));
            }
        }catch(Exception e){
            
        }
        return employee;
    }
    
    public boolean EmployeeIDValid(String EmpID,List<Employee> list)
    {
        for(Employee emp:list)
        {
            if(EmpID.equals(emp.getEmpID()))
            {
                return false;
            }
        }
        return true;
    }
    
    public void writeProductToFile(List<Product> listProduct){
    try {
        FileWriter fw = new FileWriter("Product.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(Product o:listProduct)
        {
            bw.write(o.toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
    } catch(Exception e){
}
}
    public boolean ProductIDValid(String PdID,List<Product> list)
    {
        for(Product pd:list)
        {
            if(PdID.equals(pd.getPdID()))
            {
                return false;
            }
        }
        return true;
    }
    
    public List<Product> readProductFromFile()
    {
        List<Product> product = new ArrayList<>();  
        try{
            FileReader fr = new FileReader("Product.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while(true){
                line = br.readLine();
                if(line == null){
                    break;
                }
                String txt[] = line.split("/");
                String pdID = txt[0];
                String pdName = txt[1];
                String category = txt[2];
                double price = Double.parseDouble(txt[3]);
                int stock = Integer.parseInt(txt[4]);
                product.add(new Product(pdID, pdName, category, price, stock));
            }
        }catch(Exception e){
            
        }
        return product;
    }
    
    public void writeSellToFile(List<SellHistory> listSell){
    try {
        FileWriter fw = new FileWriter("SellHistory.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(SellHistory o:listSell)
        {
            bw.write(o.toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
    } catch(Exception e){
}
}
    public boolean SellIDValid(String ShID,List<SellHistory> list)
    {
        for(SellHistory pd:list)
        {
            if(ShID.equals(pd.getShID()))
            {
                return false;
            }
        }
        return true;
    }
    
    public List<SellHistory> readSellFromFile()
    {
        List<SellHistory> sellHistory = new ArrayList<>();  
        try{
            FileReader fr = new FileReader("SellHistory.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while(true){
                line = br.readLine();
                if(line == null){
                    break;
                }
                String txt[] = line.split("/");
                String shID = txt[0];
                String pdName = txt[1];
                String category = txt[2];
                String empName = txt[3];
                int unit = Integer.parseInt(txt[4]);
                double price = Double.parseDouble(txt[5]);
                
                sellHistory.add(new SellHistory(shID, pdName, category, empName, unit, price));
            }
        }catch(Exception e){
            
        }
        return sellHistory;
    }
    
    public void writeImportToFile(List<Import> listImport){
    try {
        FileWriter fw = new FileWriter("Importlist.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(Import o:listImport)
        {
            bw.write(o.toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
    } catch(Exception e){
}
}
    public boolean ImportIDValid(String imID,List<Import> list)
    {
        for(Import im:list)
        {
            if(imID.equals(im.getImID()))
            {
                return false;
            }
        }
        return true;
    }
    
    public List<Import> readImportFromFile()
    {
        List<Import> imports = new ArrayList<>();  
        try{
            FileReader fr = new FileReader("Importlist.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while(true){
                line = br.readLine();
                if(line == null){
                    break;
                }
                String txt[] = line.split("/");
                String imID = txt[0];
                String pdName = txt[1];
                String category = txt[2];
                String spName = txt[3];
                int unit = Integer.parseInt(txt[4]);
                double price = Double.parseDouble(txt[5]);
                
                imports.add(new Import(imID, pdName, category, spName, unit, price));
            }
        }catch(Exception e){
            
        }
        return imports;
    }
     
    
    public static void main(String[] args)
    {
         StoreManage manage = new StoreManage();
         List<Employee> Emplist = manage.readEmployeeFromFile();
         for(Employee emp:Emplist)
         {
             System.out.println(emp);
         }
         List<Product> Pdlist = manage.readProductFromFile();
         for(Product pd:Pdlist)
         {
             System.out.println(pd);
         }
         List<SellHistory> Shlist = manage.readSellFromFile();
         for(SellHistory sh:Shlist)
         {
             System.out.println(sh);
         }
         List<Import> Imlist = manage.readImportFromFile();
         for(Import im:Imlist)
         {
             System.out.println(im);
         }
    }

}
