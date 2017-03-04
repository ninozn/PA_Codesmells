package time;

public class TimeParamInit {

    // Replace inheritance with delegation
    private final TimeParamInitSuper timeParamInitSuper;

    public TimeParamInit(String minutes, String hour, String partOfDay) {
        timeParamInitSuper = new TimeParamInitSuper(partOfDay, minutes, hour);
    }

    public String getMinutes() {
        return timeParamInitSuper.getMinutes();
    }

    public String getHour() {
        return timeParamInitSuper.getHour();
    }

    public String getPartOfDay() {
        return timeParamInitSuper.getPartOfDay();
    }
}
