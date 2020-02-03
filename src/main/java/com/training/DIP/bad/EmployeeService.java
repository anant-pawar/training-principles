package com.training.DIP.bad;

public class EmployeeService {
    EmployeeRepository employeeRepository;

    public EmployeeService() {
        employeeRepository = new EmployeeRepository();
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }
}
