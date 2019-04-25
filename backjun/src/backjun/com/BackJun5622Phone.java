package backjun.com;

import java.util.Scanner;

public class BackJun5622Phone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String tel = sc.nextLine();
		char[] telNum = tel.toCharArray();
		int time = 0;

		for (int i = 0; i < telNum.length; i++) 
		{
			int num = (int) telNum[i] - 65;

			if (num >= 0 && num < 3)
				time += 3;
			else if (num >= 3 && num < 6)
				time += 4;
			else if (num >= 6 && num < 9)
				time += 5;
			else if (num >= 9 && num < 12)
				time += 6;
			else if (num >= 12 && num < 15)
				time += 7;
			else if (num >= 15 && num < 19)
				time += 8;
			else if (num >= 19 && num < 22)
				time += 9;
			else if(num >= 22 && num < 26)
				time +=10;
		}
		System.out.println(time);
	}
}
