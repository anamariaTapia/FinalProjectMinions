public class Task {
    private String name;
    private boolean complited;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean compliteTask() {
        return complited = true;
    }

    public boolean anCheck() {
        return complited = false;
    }

}
