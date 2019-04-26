package backjun.com;

import java.util.Scanner;

public class BackJun2675msgRepeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		sc.nextLine();
		String[] input = new String[testCase];
		
		for(int i=0;i<testCase;i++)
		{
			input[i] = sc.nextLine();
		}

		
		for(int i=0;i<testCase;i++)
		{			
			String[] data = input[i].split(" ");
			int repeat = Integer.parseInt(data[0]);
			
			if(data.length>1) 
			{
				String[] msgArr = data[1].split("");
				for(int k=0;k<msgArr.length;k++) 
				{
					for(int j=0;j<repeat;j++) 
					{
						System.out.print(msgArr[k]);
					}
				}
			}
			System.out.println();
		}
	}
}
