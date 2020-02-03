package com.training.SRP.good;

public class WorkManager {
    public void printWorkSheet( Employee employee){
        System.out.println("Name: " + employee.getName());
        System.out.println("Email: " + employee.getEmail());

        System.out.println("Work Logs: ");

        for (WorkLog workLog: employee.getWorkLogs()){
            System.out.println("Date: " + workLog.getDate() + " Duration: " + workLog.getDuration() );
        }
    }
}
