package com.training.SRP.bad;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String email;
    private List<WorkLog> workLogs;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.workLogs = new ArrayList();
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

    public void printWorkSheet(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);

        System.out.println("Work Logs: ");

        for (WorkLog workLog: workLogs){
            System.out.println("Date: " + workLog.getDate() + " Duration: " + workLog.getDuration() );
        }
    }
}
