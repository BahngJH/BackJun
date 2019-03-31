package backjun.com;

import java.util.Scanner;

public class BackJun2439Star {
	public static void main(String[] args) {
		
		//별찍기 살짝 어려운버전2
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>0;j--) {
				if(i<j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
