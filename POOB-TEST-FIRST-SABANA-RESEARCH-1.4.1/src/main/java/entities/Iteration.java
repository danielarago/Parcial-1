package entities;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Iteration {

    private String goal;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private Project project;
    private List<Activity> activities;

    public Iteration(String goal, Project project) {
        this.goal = goal;
        this.project = project;
        this.activities = new ArrayList<>();

        project.addIteration(this);
    }

    public int countOpenActivities(){
        /*int cont = 0;

        for (Activity a : this.activities){
            if (a.isActive()){
                cont ++;
            }
        }

        return cont;*/

        return (int) this.activities.stream().map(a -> a.isActive()).filter(b -> !b).count();
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

}
