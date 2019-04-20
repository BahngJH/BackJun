package backjun.com;

import java.util.Scanner;

public class BackJun2920Music {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		String msg="";
		int s=0;
		int j=8;
		
		for(int i=0;i<8;i++) 
		{
			 arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<8;i++) 
		{
			 if(arr[i]==i+1)
				 msg="ascending";
			 else {
				 msg="mixed";
				 break;
			 }
		}
		if(msg.equals("mixed")) {
			while(s<7) {
				if(arr[s]==j)
					msg="descending";
				else {
					msg="mixed";
					s=10;
				}
				s++;
				j--;
			}
		}
		System.out.println(msg);
	}
}
