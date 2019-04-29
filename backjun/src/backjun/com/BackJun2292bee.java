package backjun.com;

import java.util.Scanner;

public class BackJun2292bee {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//방이 생성되는 라운드 체크
		int num = 1;
		//생성되는 방 수 체크, 중앙 제외하고 2부터 시작
		int beeRoom = 2;
		boolean isValue = false;
		
		while(true)
		{
			//처음 주변에 6개방 2번째 주변에 12개, 3번째 주변에 18개씩 증가함
			int end = num * 6;
			
			for(int i=0;i<end;i++)
			{
				if(beeRoom==n)
				{
					isValue = true;
					break;
				}else {
					beeRoom++;
				}
			}
			
			if(isValue==true)
				break;
			else {
				num++;
			}
		}
		//라운드 수 + 1 만큼이 최소 개수의 방을 지나서 가는 경우다.
		System.out.println(num+1);
	}
}
