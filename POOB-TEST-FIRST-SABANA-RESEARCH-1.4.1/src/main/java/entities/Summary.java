package entities;

import java.time.LocalDate;

public class Summary {

    private LocalDate date;
    private int activeProjects;
    private int openActivities;
    private int closedActivities;

    public Summary(LocalDate date, int activeProjects) {
        this.date = date;
        this.activeProjects = activeProjects;
    }

    public int getActiveProjects() {
        return activeProjects;
    }

    public LocalDate getDate() {
        return date;
    }
}
