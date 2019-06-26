import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sprint {
    private List<UserStory> userStories;
    private Date startDate;
    private Date endDate;

    public Sprint() {
        userStories = new ArrayList<>();
    }

    public void addUserStory(UserStory userStory) {
        userStories.add(userStory);
    }

    public List<UserStory> getUserStories() {
        return userStories;
    }

    public List<UserStory> getUserStoryByState(String state) {
        List<UserStory> resulUserStory = new ArrayList<>();
        userStories.stream().forEach(userStory -> {
            if (userStory.getState().equals(state)) {
                resulUserStory.add(userStory);
            }
        });
        return resulUserStory;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
