package backjun.com;

import java.util.Scanner;

public class BackJun1193SearchBunSu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int colum =1;
		int row = 1;
		int result = 1;
		boolean isSearch = false;
		
		while(n>1)
		{
			//행이 1일 때
			if(colum==1) 
			{
				row++;
				result++;
				
				if(result==n)
					break;
				//대각선 위에서 아래로 내려오는 로직
				while(true)
				{
					row--;
					colum++;
					result++;
					if(result==n) 
					{
						isSearch=true;
						break;
					}
					if(row==1)
						break;
				}
			}
			//원하는 분수를 찾았을 때
			if(isSearch==true)
				break;
			
			//열이 1일 때
			if(row==1)
			{
				colum++;
				result++;
				
				if(result==n)
					break;
				//대각선 아래서 위로 올라가는 로직
				while(true)
				{
					colum--;
					row++;
					result++;
					if(result==n) 
					{
						isSearch=true;
						break;
					}
					if(colum==1)
						break;
				}
			}
			//원하는 분수를 찾았을 때
			if(isSearch==true)
				break;
		}
		System.out.println(colum+"/"+row);
	}
}
