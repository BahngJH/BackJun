package backjun.com;

import java.util.Scanner;

public class BackJun1924Calender2007 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int monthCK = 1;
		int dayCK = 0;
		int totalDay = 0;
		
		while(true)
		{
			if(month==monthCK)
				break;
			else {
				if(monthCK == 1 || monthCK == 3 || monthCK == 5 || monthCK == 7 || monthCK == 8 || monthCK == 10 || monthCK == 12)
					totalDay +=31;
				else if(monthCK == 2)
					totalDay +=28;
				else
					totalDay +=30;
					
				monthCK++;
			}
		}
		
		totalDay +=day;
		int result = totalDay % 7;
		
		if(result ==1)
			System.out.println("MON");
		if(result ==2)
			System.out.println("TUE");
		if(result ==3)
			System.out.println("WED");
		if(result ==4)
			System.out.println("THU");
		if(result ==5)
			System.out.println("FRI");
		if(result ==6)
			System.out.println("SAT");
		if(result ==0)
			System.out.println("SUN");
		
		
	}
}
