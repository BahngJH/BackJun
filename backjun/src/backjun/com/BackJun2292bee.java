package backjun.com;

import java.util.Scanner;

public class BackJun2292bee {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 방이 생성되는 라운드 체크
		int round = 1;
		
		int start = 2;
		int end = 7;

		while (n > 1) 
		{
			if(start<=n && n<=end)
			{
				//1을 포함한 최단경로 때문에 1 더함
				round +=1;
				break;
			}else {
				start = start+(round*6);
				end = end+((round+1)*6);
				round++;
			}
		}
		if (n == 1)
			System.out.println(1);
		else
			// 라운드 수 + 1 만큼이 최소 개수의 방을 지나서 가는 경우다.
			System.out.println(round);
	}
}
