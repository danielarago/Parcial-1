package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private String goal;
    private Group group;
    private List<Iteration> iterations;

    public Project(String name, LocalDate dateInit, LocalDate dateEnd, Group group) {
        this.name = name;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.group = group;
        this.iterations = new ArrayList<>();

        group.addProject(this);
    }

    public void addIteration(Iteration iteration) {
        this.iterations.add(iteration);
    }

    public void setDateInit(LocalDate dateInit) {
        this.dateInit = dateInit;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * Evaluate if a project is active.
     *
     * @return false if the project has open activities or the dateEnd is before than the system date.
     */
    public int countOpenActivities() {
        /*int cont = 0;

        for (Iteration i : iterations){
               cont += i.countOpenActivities();
        }

       return cont;*/

       return this.iterations.stream().map(i -> i.countOpenActivities()).reduce(0, (a, b) -> a+b);
    }

    public boolean isActive() {
        boolean result = true;

        if (LocalDate.now().isAfter(this.dateEnd)){
            result = false;
        } else {
            int openActivities = this.countOpenActivities();
            result = openActivities > 0;
        }

        return result;
    }


}
