import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reed = new Scanner(System.in);
        ManagerProject managerProject = new ManagerProject();

        System.out.println("Menu");
        System.out.println("1.- Create Project");
        System.out.println("2.- Open Project");
        System.out.println("Choose option");
        int index = reed.nextInt();
        switch (index) {
            case 1:
                System.out.println("Please enter project name");
                String name = reed.next();
                managerProject.addProject(new Project(name));
                showProject(managerProject.getProjectList());
                break;
            case 2:
                System.out.println("Please enter project name");
                String nameProject = reed.next();
                Project project = managerProject.getProject(nameProject);
                System.out.println(project.getName());
                System.out.println("List of Sprint");
                List<Sprint> sprints = project.getSprintList();
                for (int i = 0; i <= sprints.size(); i++) {
                    System.out.println(i + ".-" + sprints.get(i).getStartDate() + "," + sprints.get(i).getEndDate());
                }
        }
    }

    private static void showProject(List<Project> projectList) {
        for (int i = 0; i < projectList.size(); i++) {
            Project project = projectList.get(i);
            System.out.println("List Of Project:");
            System.out.println(i + ".-" + project.getName());
        }
    }

}
