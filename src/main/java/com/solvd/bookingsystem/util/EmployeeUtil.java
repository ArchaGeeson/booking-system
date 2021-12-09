package com.solvd.bookingsystem.util;

import com.solvd.bookingsystem.bean.profiles.Employee;

public class EmployeeUtil<T extends Employee>{
    
   private T employee;
    
   public EmployeeUtil(T employee){
	   this.employee = employee;
   }
    
   public int getSalary(){
       return employee.getSalary();
   }
    
   public boolean isSalaryEqual(EmployeeUtil secondEmp){
        
       if(employee.getSalary() == secondEmp.getSalary()){
           return true;
       }
       return false;
   }
   
   

}
