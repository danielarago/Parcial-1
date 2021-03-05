package entities;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Group {

    private int id;
    private LocalDate createdAt;
    private String name;
    private String area;
    private List<Project> projects;

    public Group(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project plan) {
        this.projects.add(plan);
    }

}
