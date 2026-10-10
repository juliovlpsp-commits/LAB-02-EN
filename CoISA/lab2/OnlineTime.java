package lab2;

/**
 * online time tracker for a course
 */
public class OnlineTime {
    private String courseName;
    private int expectedTime;
    private int spentTime;

    public OnlineTime(String courseName) {
        this(courseName, 120);
    }

    public OnlineTime(String courseName, int expectedTime) {
        this.courseName = courseName;
        this.expectedTime = expectedTime;
        this.spentTime = 0;
    }

    /**
     * add online time
     * @param time hours to add
     */
    public void addOnlineTime(int time) {
        this.spentTime += time;
    }

    public boolean reachedGoal() {
        return this.spentTime >= this.expectedTime;
    }

    @Override
    public String toString() {
        return this.courseName + " " + this.spentTime + "/" + this.expectedTime;
    }
}
