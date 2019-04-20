package backjun.com;

import java.util.Scanner;

public class BackJun2448HardStar {
	static int count =0;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		star(n,n);
	}
	
	public static void star(int n, int round) {
		
		if(count==round) {
			return;
		}
		else {
			//첫 번째 별 찍기
			++count;
			for(int i=0;i<n;i++) 
			{
				if(i==n-1) 
					System.out.print("*");
				else 
					System.out.print(" ");
				
			}
			System.out.println();
			
			//두 번째 별 찍기
			++count;
			for(int j=0;j<n+1;j++) 
			{
				if(j==n-2) 
					System.out.print("*");
				
				else if(j==n) 
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			System.out.println();
			
			//세 번째 별 찍기
			++count;
			for(int k=0;k<n+2;k++) 
			{
				if(k>n-4 && k<n+3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			star(n-3,round);
		}
	}
}
