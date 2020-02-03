package com.training.DIP.good;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public void save(Employee employee) {
        System.out.println("Saving :" + employee.getName());
    }
}
