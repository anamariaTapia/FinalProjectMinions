import java.util.ArrayList;
import java.util.List;

public class ManagerProject {
    private List<Project> projectList;

    public ManagerProject() {
        projectList = new ArrayList<>();
    }

    public void addProject(Project project) {
        projectList.add(project);
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public Project getProject(String nameProject) {
        Project resultProject = projectList.stream().filter(project -> project.getName().equals(nameProject)
        ).findFirst().get();
        return resultProject;
    }
}
