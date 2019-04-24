package backjun.com;

import java.util.Scanner;

public class BackJun1157wordStudy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		char[] inputArr = input.toCharArray();
		char[] alpa = new char[26];
		int max = 0;
		int result = 0;
		int isWord = 0;
		
		for(int i=0;i<inputArr.length;i++) 
		{
			//소문자 일 때
			if((int)inputArr[i]>96) 
			{
				int temp = (int)inputArr[i]-32;
				
				for(int j=0;j<alpa.length;j++) 
				{					
					if(temp==j+65) 
					{
						alpa[j]++;
					}
				}
			//대문자 일 때 	
			}else {
				int temp = (int)inputArr[i];
				for(int j=0;j<alpa.length;j++) 
				{					
					if(temp==j+65) 
					{
						alpa[j]++;
					}
				}
			}
		}
		
		//일단 최대값 찾고
		for(int i=0;i<alpa.length;i++) 
		{
			if(alpa[i]>max) 
			{
				max = alpa[i];
				result = i;
			}
		}
		
		//최대가 중복되는지 확인
		for(int i=0;i<alpa.length;i++) 
		{
			if(max==alpa[i])
				isWord++;
		}
		
		//최대값이 1개라면 값도 1
		if(isWord==1)
			System.out.println((char)(result+65));
		else
			System.out.println("?");
	}
}
