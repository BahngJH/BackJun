package backjun.com;

import java.util.Scanner;

public class BackJun2441 {
	public static void main(String[] args) {
		
		//별찍기 살짝 어려운 버전
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i < j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
