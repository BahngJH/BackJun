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
			String[] ox = new String[10];
			int score = 0;
			
			for(int i=0;i<10;i++) {
				ox[i] = sc.nextLine();
			}
			
			for(int i=0;i<ox.length;i++)
			{
				if(ox[i].equals("O")) {
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
