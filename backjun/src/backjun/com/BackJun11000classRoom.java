package backjun.com;

import java.util.Scanner;

public class BackJun11000classRoom {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totalCase = sc.nextInt();
		int index = 0;
		int[] startTime = new int[totalCase];
		int[] endTime = new int[totalCase];
	
		while(index!=totalCase)
		{
			startTime[index] = sc.nextInt();
			endTime[index] = sc.nextInt();
			index++;
		}
		int result = 1;
		int dard = endTime[0];
		
		for(int i=1; i<totalCase; i++)
		{
			if(startTime[i] >= dard)
			{
				dard = endTime[i];
				result++;
			}
		}
		System.out.println(result);
	}
}
