package com.training.SRP.bad;

import java.time.Duration;
import java.time.LocalDate;

public class WorkLog {
    private LocalDate date;
    private Duration duration;

    public WorkLog(LocalDate date, Duration duration) {
        this.date = date;
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public Duration getDuration() {
        return duration;
    }
}
