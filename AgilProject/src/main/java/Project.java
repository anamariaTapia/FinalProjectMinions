import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private List<Sprint> sprintList;

    public Project(String name) {
        this.name = name;
        sprintList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSprint(Sprint sprint) {
        sprintList.add(sprint);
    }

    public List<Sprint> getSprintList() {
        return sprintList;
    }
}
