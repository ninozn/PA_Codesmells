import time.TimeParamInit;

public class Text {
    //Extract method object
    //change method signature (attributes added)
    //Extract parameter object -> TimeParamInit.java
    //Make static
    public static String generateTimeText(TimeParamInit timeParamInit) {
        if(timeParamInit.getMinutes().equals("uur"))
        {
            return timeParamInit.getHour() +" "+ timeParamInit.getMinutes() + timeParamInit.getPartOfDay();

        }
        else if(timeParamInit.getMinutes().equals("kwart voor"))
        {
            return timeParamInit.getMinutes() +" "+ timeParamInit.getHour() + timeParamInit.getPartOfDay() +"\n";
        }
        else if(timeParamInit.getMinutes().equals("half"))
        {
            return timeParamInit.getMinutes() +" "+ timeParamInit.getHour() + timeParamInit.getPartOfDay() +"\n";
        }
        else
        {
            return timeParamInit.getMinutes() +" "+ timeParamInit.getHour() + timeParamInit.getPartOfDay();
        }
    }
}