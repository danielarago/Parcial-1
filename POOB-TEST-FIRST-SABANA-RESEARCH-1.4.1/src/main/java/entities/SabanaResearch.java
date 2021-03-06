package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SabanaResearch {

    private LocalDate currentDate;
    private List<Group> groups;
    private List<Summary> summaries;
    private List<Course> courses;

    public SabanaResearch(List<Group> groups) {
        this.groups = groups;
        this.summaries = new ArrayList<>();
    }

    public int countOfGroups() {
        return this.groups.size();
    }

    public int countOfSummaries() {
        return this.summaries.size();
    }

    /**
     * Create a summary entry in the current date.
     * - Calculate the count of active projects.
     *
     * @return The new Summary entry.
     */
    public Summary createSummaryEntry(){
        currentDate = LocalDate.now();
        int ap=0;
        for (Group g : groups){
            ap = g.countActiveProjects();
        }

        return new Summary(currentDate, ap);
    }
}
