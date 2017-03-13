//Extract interface

public interface ConvertTimeImp {
    String KWART_OVER = "kwart over";
    String QUARTER_PAST = KWART_OVER; //extract constant
    String KWART_VOOR = "kwart voor";
    String QUARTER_TO = KWART_VOOR; //extract constant
    String HALF = "half";
    String HALF_PAST = HALF; //extract constant
    String UUR = "uur";
    String O_CLOCK = UUR; //extract constant

    String convertTimeToString();

    String getPartOfDay(String partOfDay);

    String hoursToString();

    String minutestToString(String minutes);

}
