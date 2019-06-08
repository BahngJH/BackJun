package backjun.com;

import java.util.Scanner;

public class BackJun11047Coin {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int sum = sc.nextInt();
		int[] unit = new int[count];
		int index=0;
		int result = 0;
		
		while(count!=index)
		{
			unit[index] = sc.nextInt();
			index++;
		}
		
		for(int i=count-1;i>-1;i--)
		{
			result += sum / unit[i];
			sum = sum % unit[i];
		}
		System.out.println(result);
	}
}
