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

    public int countActiveProjects(){
        /*int ap = 0;

        for (Project p : projects){
            if (p.isActive()){
                ap++;
            }
        }

        return ap;*/

        return (int) this.projects.stream().map(p -> p.isActive()).filter(b->b).count();
    }

    public void addProject(Project plan) {
        this.projects.add(plan);
    }

}
