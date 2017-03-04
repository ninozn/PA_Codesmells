
public class Main
{
	private String tijd;
	private	 int uren;
	private int minuten;

	public Main(int ur,int min)
	{
	uren=ur;
	minuten=min;
	}
		public static void drukTijdAf(int uren,int minuten)
		{

			String hour="";
			String minutes="";
			String partOfDay="";
			if(minuten>=12&&minuten<=20)//bekijk min
			{
				minutes ="kwart over";
			}
			else if(minuten>42&&minuten<49)//bekijk min en uren +1
			{
				minutes="kwart voor";
				uren++;
			}
			else if(minuten>20&&minuten<42)//bekijk min en uren +1
			{
				minutes="half";
				uren++;
			}
			else if(minuten>=49&&minuten<60) //bekijk min;heel uur
			{
				minutes="uur";
			}
			else if(minuten>=0&&minuten<11) // bekijk min; heel uur
			{
				minutes="uur";
			}

			switch(uren)
			{
				case 1 :
				case 13 : hour = "een";
					break;
				case 2 :
				case 14 : hour = "twee";
					break;
				case 3 :
				case 15 : hour = "drie";
					break;
				case 4 :
				case 16 : hour = "vier";
					break;
				case 5 :
				case 17 : hour = "vijf";
					break;
				case 6 :
				case 18 : hour = "zes";
					break;
				case 7 :
				case 19 : hour = "zeven";
					break;
				case 8 :
				case 20 : hour = "acht";
					break;
				case 9 :
				case 21 : hour = "negen";
					break;
				case 10 :
				case 22 : hour = "tien";
					break;
				case 11 :
				case 23 : hour = "elf" ;
					break;
				case 0 :
				case 12 : hour = "twaalf";
				default: hour = "ongeldig"; break;
			}
			if(uren>=0&&uren<7)
			{
				partOfDay=" s'nachts";
			}
			if(uren>=6&&uren<12)
			{
				partOfDay=" s'ochtends";
			}
			if(uren>=12&&uren<18)
			{
				partOfDay=" s'middags";
			}
			if(uren>=18&&uren<24)
			{
				partOfDay=" s'avonds";
			}
			if(minutes.equals("uur"))
			{
				System.out.println(hour+" "+minutes+partOfDay);

			}
			else if(uren==0&&minutes.equals("kwart voor"))
			{
				hour="een";
				System.out.print(minutes+" "+hour+partOfDay+"\n");
			}
			else if(uren==0&&minutes.equals("half"))
			{
				hour="een";
				System.out.print(minutes+" "+hour+partOfDay+"\n");
			}
			else
			{
				System.out.println(minutes+" "+hour+partOfDay);

			}

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



