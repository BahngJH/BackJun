package backjun.com;

import java.util.Scanner;

public class BackJun8958OX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		sc.nextLine();
		int round=0;
		int[] sum = new int[testCase];
		
		while(round!=testCase) 
		{
			int score = 0;
			String inputOx = sc.nextLine();
			char[] ox = inputOx.toCharArray();
			
			for(int i=0;i<ox.length;i++)
			{
				if(ox[i] == 'O') {
					sum[round] += ++score;
				}else {
					score=0;
				}
			}
			round++;
		}
		for(int i:sum) {
			System.out.println(i);
		}
	}
}
