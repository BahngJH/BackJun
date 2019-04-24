package backjun.com;

import java.util.Scanner;

public class BackJun2908sangSu {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String value = sc.nextLine();
		String[] div = value.split(" ");
		int data = Integer.parseInt(div[0]);
		int data2 = Integer.parseInt(div[1]);
		
		int reverse = reveresValue(data);
		int reverse2 = reveresValue(data2);
		
		if(reverse>reverse2) 
			System.out.println(reverse);
		else
			System.out.println(reverse2);
		
		
	}
	
	public static int reveresValue(int data) 
	{
		int reverse = 0;
		
		while(true)
		{
			//앞자리 구하고 아래서 100의 자리 10의 자리 등 구해서 곱하기
			int a = data % 10;
			
			int temp = data;
			int num = 0;

			//10의 자리인지 100의 자리인지 구하고
			while(true)
			{
				temp = temp / 10;
				num++;
				if(temp==0)
					break;
			}
			
			//10을 곱해서 자릿수 만큼 맞추고 앞자리 곱하기
			for(int i=1;i<num;i++)
			{
				a = a * 10;
			}
			
			//변수 초기화
			num = 0;
			//값 더하기
			reverse +=a;
			data = data/10;
			if(data==0)
				break;
		}
		
		return reverse;
	}
}
