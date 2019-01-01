package backjun.com;

import java.util.Scanner;

public class BackJun11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		double count =sc.nextInt();
		double n =sc.nextInt();
		double key=1;
		
		for(int i=1;i<count;i++) {
			key*=10;
		}
		System.out.println(key);
		while(key>0) {
			sum += n/key;
			n = n%key;
			key = key/10;
		}
		System.out.println(sum);
	}
}	
