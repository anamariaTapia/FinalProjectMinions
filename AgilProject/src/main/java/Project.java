import java.util.ArrayList;
import java.util.List;

public class Project {
    private Sprint name;
    private List<Sprint> sprintList;

    public Project(Sprint name){
        this.name = name;
        sprintList = new ArrayList<>();
    }

    public Sprint getName() {
        return name;
    }

    public void setName(Sprint name) {
        this.name = name;
    }

    public List<Sprint> getSprintList() {
        return sprintList;
    }

    public void setSprintList(List<Sprint> sprintList) {
        this.sprintList = sprintList;
    }
}
