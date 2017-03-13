import time.TimeParamInitBuilder;

public class ConvertTime implements ConvertTimeImp {
    private int hoursInNumber;
    private int minutesInNumber;
    private String hour, minutes, partOfDay;

    // factory method
    public ConvertTime(int hoursInNumber, int minutesInNumber) {
        this.hoursInNumber = hoursInNumber;
        this.minutesInNumber = minutesInNumber;
    }

    public static ConvertTime createConvertTime(int hoursInNumber, int minutesInNumber) {
        return new ConvertTime(hoursInNumber, minutesInNumber);
    }

    @Override
    public String convertTimeToString() {
        checkRounding(minutesInNumber);

        minutes = minutestToString(minutes); //Extract method
        hour = hoursToString(); //Extract method
        partOfDay = getPartOfDay(partOfDay); //Extract method

        // introduce builder -> time.TimeParamInitBuilder
        return Text.generateTimeText(new TimeParamInitBuilder().setMinutes(minutes).setHour(hour).setPartOfDay(partOfDay).createTimeParamInit());
    }

    @Override
    public String getPartOfDay(String partOfDay) {
        if(hoursInNumber>=0&&hoursInNumber<7)
        {
            partOfDay=" s'nachts";
        }
        if(hoursInNumber>=6&&hoursInNumber<12)
        {
            partOfDay=" s'ochtends";
        }
        if(hoursInNumber>=12&&hoursInNumber<18)
        {
            partOfDay=" s'middags";
        }
        if(hoursInNumber>=18&&hoursInNumber<24)
        {
            partOfDay=" s'avonds";
        }
        return partOfDay;
    }

    @Override
    public String hoursToString() {
        switch(hoursInNumber)
        {
            case 1 :
            case 13 : return "een";
            case 2 :
            case 14 : return "twee";
            case 3 :
            case 15 : return "drie";
            case 4 :
            case 16 : return "vier";
            case 5 :
            case 17 : return "vijf";
            case 6 :
            case 18 : return "zes";
            case 7 :
            case 19 : return "zeven";
            case 8 :
            case 20 : return "acht";
            case 9 :
            case 21 : return "negen";
            case 10 :
            case 22 : return "tien";
            case 11 :
            case 23 : return "elf" ;
            case 0 :
            case 12 : return "twaalf";
            default: return "ongeldig";
        }
    }

    @Override
    public String minutestToString(String minutes) {
        if(minutesInNumber>=12&&minutesInNumber<=20)//bekijk min
        {
            minutes = QUARTER_PAST;
        }
        else if(minutesInNumber>42&&minutesInNumber<49)//bekijk min en uren +1
        {
            minutes= QUARTER_TO;
        }
        else if(minutesInNumber>20&&minutesInNumber<42)//bekijk min en uren +1
        {
            minutes= HALF_PAST;
        }
        else
        {
            minutes = O_CLOCK;
        }

        return minutes;
    }

    private void roundToNextHour() {
        hoursInNumber++;
    }

    private void checkRounding(int minutes) {
        if(minutes >= 23 && minutes < 60) {
            roundToNextHour();
        }
    }

    public boolean runValidations() {
        return validateHours() && validateMinutes() ? true : false;
    }

    private boolean validateHours() {
        return hoursInNumber >= 0 && hoursInNumber <= 23 ? true : false;
    }

    private boolean validateMinutes() {
        return minutesInNumber >= 0 && minutesInNumber <= 59 ? true : false;
    }


}