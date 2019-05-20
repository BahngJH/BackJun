package backjun.com;

import java.util.Scanner;

public class BackJun6064ka_ing {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int round = 0;
		int[] result = new int[testCase];
		
		while(testCase!=round)
		{
			int M = sc.nextInt();
			int N = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			result = short_ka_ing(M,N,x,y,result,round);
			
			round++;
			System.out.println(testCase+" "+round);
		}
		for(int i:result)
			System.out.println(i);
	}
	
	public static int[] short_ka_ing(int M, int N, int x, int y, int[] result, int round) 
	{
		int num = 1;
		int y2 = 1;
		boolean isValue = false;
		
		while(true)
		{	
			System.out.println(M+" "+N+" "+num+" "+y2);
			if(num == 1 && x>1) 
			{	
				y2 += x-1;
				num += x-1;
			}else {
				y2 += M;
				num += M;
			}
			
			if(y2 > N) {
				//y2-N을 한번만 해도 값이 더 큰 경우에 작아질 때 까지 빼준다.
				while(y2 > N) 
				{
					y2 = y2-N;
				}
			}
			
			if(y2 == y) 
			{
				isValue = true;
				break;
			}
			
		}
		if(isValue == true)
			result[round] = num;
		else
			result[round] = -1;
		
		return result;
	}
	
	public static int[] ka_ing(int M, int N, int x, int y, int[] result, int round)
	{
		int num = 1;
		int x2 =1, y2 =1;
		boolean isValue = true;
		
		while(true) 
		{	
			if(x==x2 && y==y2) 
				break;
			else {
				num++;
				
				if(x2>=M)
					x2=1;
				else
					x2++;
				
				if(y2>=N)
					y2=1;
				else
					y2++;
			}
			
			if(x2==1 && y2==1)
			{
				isValue = false;
				break;
			}
		}
		
		if(isValue==true)
			result[round] = num;
		else
			result[round] = -1;
		
		return result;
	}
}
