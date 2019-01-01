package backjun.com;

import java.util.Scanner;

public class BackJun11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
		int count = sc.nextInt();
		sc.nextLine();
		String n = sc.nextLine();
		
		for(int i=0;i<count;i++) {
			sum +=Integer.parseInt(n.substring(i, i+1));
		}
		System.out.println(sum);	
	}
}	
