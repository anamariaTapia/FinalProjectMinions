import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sprint {
    private List<UserStory> userStories;
    private Date startDate;
    private Date endDate;

    public Sprint(){
        userStories = new ArrayList<>();
    }

    public List<UserStory> getUserStories() {
        return userStories;
    }

    public void setUserStories(List<UserStory> userStories) {
        this.userStories = userStories;
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
