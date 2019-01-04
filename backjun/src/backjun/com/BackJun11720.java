package backjun.com;

import java.util.Scanner;

public class BackJun11720 {
	public static void main(String[] args) {
		
		//입력받은 수의 숫자 하나하나를 쪼개서 더한값 출력하기
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
