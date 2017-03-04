//Extract interface

public interface ConvertTimeImp {
    String QUARTER_PAST = "kwart over"; //extract constant
    String QUARTER_TO = "kwart voor"; //extract constant
    String HALF_PAST = "half"; //extract constant
    String O_CLOCK = "uur"; //extract constant

    String convertTimeToString();

    String getPartOfDay(String partOfDay);

    String hoursToString();

    String minutestToString(String minutes);
}
