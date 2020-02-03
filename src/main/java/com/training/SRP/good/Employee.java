package com.training.SRP.good;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String email;
    private List<WorkLog> workLogs;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.workLogs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<WorkLog> getWorkLogs() {
        return workLogs;
    }
}
