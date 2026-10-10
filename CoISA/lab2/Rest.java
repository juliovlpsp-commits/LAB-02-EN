package lab2;

/**
 * student rest control
 */
public class Rest {
    private int restHours;
    private int weeks;

    public Rest() {
        this.restHours = 0;
        this.weeks = 0;
    }

    /**
     * set rest hours
     * @param value rest hours
     */
    public void setRestHours(int value) {
        this.restHours = value;
    }

    /**
     * set number of weeks
     * @param value number of weeks
     */
    public void setWeeks(int value) {
        this.weeks = value;
    }

    /**
     * check rest status
     * @return rested or tired
     */
    public String getStatus() {
        if (this.weeks > 0 && ((double) this.restHours / this.weeks) >= 26) {
            return "rested";
        }
        return "tired";
    }
}
