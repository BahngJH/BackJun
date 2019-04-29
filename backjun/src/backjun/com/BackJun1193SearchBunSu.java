package backjun.com;

import java.util.Scanner;

public class BackJun1193SearchBunSu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int colum =1;
		int row = 1;
		int result = 1;
		
		while(true)
		{
			if(n==1)
				break;
			
			if(colum==1) 
			{
				row++;
				result++;
				
				if(result==n)
					break;
				
				while(true)
				{
					row--;
					colum++;
					result++;
					
					if(result==n)
						break;
					if(row==1)
						break;
					
				}
			}
			
			if(row==1)
			{
				colum++;
				result++;
				
				if(result==n)
					break;
				
				while(true)
				{
					colum--;
					row++;
					result++;
					if(result==n)
						break;
					if(colum==1)
						break;
				}
			}
		}
		System.out.println(colum+"/"+row);
	}
}
