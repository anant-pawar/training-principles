package com.training.DIP.good;

public class EmployeeService {
    EmployeeRepository employeeRepository;

    public EmployeeService() {
        employeeRepository = new EmployeeRepositoryImpl();
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }
}
