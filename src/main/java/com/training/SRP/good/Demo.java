package com.training.SRP.good;

import java.time.Duration;
import java.time.LocalDate;

public class Demo {

    public static void main(String[] args){
        Employee employee = new Employee(
                "Jhon",
                "jhon.snow@gmail.com");

        employee.getWorkLogs().add(new WorkLog(LocalDate.of(2020,02, 01), Duration.ofHours(8).plusMinutes(25)));
        employee.getWorkLogs().add(new WorkLog(LocalDate.of(2020,02, 03), Duration.ofHours(8).plusMinutes(25)));
        employee.getWorkLogs().add(new WorkLog(LocalDate.of(2020,02, 06), Duration.ofHours(8).plusMinutes(25)));

        new WorkManager().printWorkSheet(employee);
    }
}
