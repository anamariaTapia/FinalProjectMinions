import java.util.ArrayList;
import java.util.List;

public class ManagerProject {
    private List<Project> projectList;

    public ManagerProject(){
        projectList = new ArrayList<>();
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }
}
