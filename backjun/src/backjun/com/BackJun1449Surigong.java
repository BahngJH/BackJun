package backjun.com;

import java.util.Scanner;

public class BackJun1449Surigong {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int count = sc.nextInt();
		int length = sc.nextInt();
		
		int[] point = new int[count];
		
		for(int i=0; i<count; i++)
		{
			point[i] = sc.nextInt();
		}
		
		for(int i=0; i<count-1; i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(point[j]-point[i]>length)
				{
					i=j-1;
					result++;
					break;
				}
			}
		}
		//마지막 단계서 계산 안되는 것 더해줌
		result++;
		System.out.println(result);
	}
}
