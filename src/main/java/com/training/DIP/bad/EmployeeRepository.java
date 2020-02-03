package com.training.DIP.bad;

public class EmployeeRepository {
    public void save(Employee employee){
        System.out.println("Saving :" + employee.getName());
    }
}
