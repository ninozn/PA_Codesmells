// move refactoring ->  to src folder

public class Main
{
	private String tijd;
	private	 int uren;
	private int minuten;

	public Main()
	{
	}
		public static void drukTijdAf(int hoursInNumber,int minutesInNumber)
		{
            System.out.println(ConvertTime.createConvertTime(hoursInNumber, minutesInNumber).convertTimeToString());
		}

    public static void main(String[]arg)
		{
			drukTijdAf(9, 15); //wordt: kwart over negen
			drukTijdAf(0, 45);// wordt: kwart voor ��n
			drukTijdAf(0, 15); //wordt: kwart over twaalf
			drukTijdAf(0, 30); //wordt: kwart over twaalf
			drukTijdAf(10, 30); //wordt: kwart over twaalf
			drukTijdAf(9, 47); //wordt: kwart over twaalf
			drukTijdAf(2, 43); //wordt: kwart over twaalf




		}


}



