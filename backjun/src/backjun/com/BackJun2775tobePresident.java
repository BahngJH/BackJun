package backjun.com;

import java.util.Scanner;

public class BackJun2775tobePresident 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int round = 0;
		int[] result = new int[testCase];
		
		
		while(testCase!=round)
		{
			int colum = sc.nextInt();
			int row = sc.nextInt();
			int[][] house = new int[colum+1][row];
			int temp = 1;
			
			for(int i=0;i<=colum;i++)
			{
				for(int j=0;j<row;j++)
				{
					if(i==0)
						house[i][j] = temp++;
					
					else
					{
						//이전 행의 현재 열까지의 값으로, 현재 값 대체
						for(int k=0;k<=j;k++) 
						{
							house[i][j] += house[i-1][k];
						}
					}
					
				}
			}
			result[round] = house[colum][row-1];
			round++;
		}
		for(int i:result)
			System.out.println(i);
	}
}
