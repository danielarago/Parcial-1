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

    public boolean countOpenActivities(){
        boolean result = false;
        int cont = 0;

        for (Activity a : activities){
            if (a.isActive()){
                cont ++;
            }
        }

        if (cont==activities.size()){
            result = true;
        }

        return result;
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

}
