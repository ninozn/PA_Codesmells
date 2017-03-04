package time;

/**
 * Created by Nino on 4-3-2017.
 */
public class TimeParamInitSuper {
    protected final String minutes;
    protected final String hour;
    protected final String partOfDay;

    public TimeParamInitSuper(String partOfDay, String minutes, String hour) {
        this.partOfDay = partOfDay;
        this.minutes = minutes;
        this.hour = hour;
    }

    public String getMinutes() {
        return minutes;
    }

    public String getHour() {
        return hour;
    }

    public String getPartOfDay() {
        return partOfDay;
    }
}
