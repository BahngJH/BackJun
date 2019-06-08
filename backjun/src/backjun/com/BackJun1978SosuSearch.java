package backjun.com;

import java.util.Scanner;

public class BackJun1978SosuSearch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		int sosuNum = 0;
		boolean isSosu = true;
		
		while(caseNum > 0)
		{
			int input = sc.nextInt();
			
			for(int i=2;i<input;i++)
			{
				if(input % i==0)
				{
					isSosu = false;
				}
			}
			if(input > 1 && isSosu==true)
				sosuNum++;
			caseNum--;
		}
		System.out.println(sosuNum);
	}
}
