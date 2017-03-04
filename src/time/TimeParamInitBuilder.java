package time;

public class TimeParamInitBuilder {
    private String minutes;
    private String hour;
    private String partOfDay;

    public TimeParamInitBuilder setMinutes(String minutes) {
        this.minutes = minutes;
        return this;
    }

    public TimeParamInitBuilder setHour(String hour) {
        this.hour = hour;
        return this;
    }

    public TimeParamInitBuilder setPartOfDay(String partOfDay) {
        this.partOfDay = partOfDay;
        return this;
    }

    public TimeParamInit createTimeParamInit() {
        return new TimeParamInit(minutes, hour, partOfDay);
    }
}