package backjun.com;

import java.util.Scanner;

public class BackJun2577NumCount {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int multi = a*b*c;
		
		int[] number = new int[10];
		
		do 
		{
			int num = 0;
			num = multi % 10;
			number[num]++;
			multi = multi/10;
			
		}while(multi!=0);
		
		for(int i:number)
			System.out.println(i);
	}
}
