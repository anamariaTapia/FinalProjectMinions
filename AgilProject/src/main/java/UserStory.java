import java.util.ArrayList;
import java.util.List;

public class UserStory {
    private String title;
    private String description;
    private List<AceptanCriteria> aceptanCriteriaList;
    private List<Task> taskList;
    private Owner owner;
    private int storyPoint;
    private State state;

    public UserStory(){
        aceptanCriteriaList = new ArrayList<>();
        taskList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AceptanCriteria> getAceptanCriteriaList() {
        return aceptanCriteriaList;
    }

    public void setAceptanCriteriaList(List<AceptanCriteria> aceptanCriteriaList) {
        this.aceptanCriteriaList = aceptanCriteriaList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getStoryPoint() {
        return storyPoint;
    }

    public void setStoryPoint(int storyPoint) {
        this.storyPoint = storyPoint;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

