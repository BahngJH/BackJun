package backjun.com;

import java.util.Scanner;

public class BackJun2675msgRepeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int repeat = sc.nextInt();
		sc.nextLine();
		String msg = sc.nextLine();
		
		String[] msgArr = msg.split("");
		for(int i=0;i<msgArr.length;i++) 
		{
			for(int j=0;j<repeat;j++) 
			{
				System.out.print(msgArr[i]);
			}
		}
		
	}
}
