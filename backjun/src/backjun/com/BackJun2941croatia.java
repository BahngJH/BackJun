package backjun.com;

import java.util.Scanner;

public class BackJun2941croatia {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String croat = sc.nextLine();
		char[] croatArr = croat.toCharArray();
		int croatAlpa = 0;
		
		for(int i=0;i<croatArr.length;i++)
		{
				//c가 나올 때 검사
				if(croatArr[i]=='c') 
				{
					if(i+1<croatArr.length) {	
						if(croatArr[i+1]=='=') {
							croatAlpa++;
							i++;
						}
						else if(croatArr[i+1]=='-') {
							croatAlpa++;
							i++;
						}
					}
				}
				//d가 나올때 검사
				else if(croatArr[i]=='d')
				{
					if(i+1<croatArr.length) {
						if(croatArr[i+1]=='z')
						{
							if(i+2<croatArr.length) {
								if(croatArr[i+2]=='=') 
								{
									croatAlpa +=2;
									i += 2;
								}
							}
						}
						else if(croatArr[i+1]=='-')
						{
							croatAlpa++;
							i++;
						}
					}
				}
				else if(croatArr[i]=='l')
				{
					if(i+1<croatArr.length) {
						if(croatArr[i+1]=='j') {
							croatAlpa++;
							i++;
						}
					}
				}
				else if(croatArr[i]=='n')
				{
					if(i+1<croatArr.length) {	
						if(croatArr[i+1]=='j') {
							croatAlpa++;
							i++;
						}
					}
				}
				else if(croatArr[i]=='s')
				{ 
					if(i+1<croatArr.length) {
						if(croatArr[i+1]=='=') {
							croatAlpa++;
							i++;
						}
					}
				}
				else if(croatArr[i]=='z')
				{
					if(i+1<croatArr.length) {
						if(croatArr[i+1]=='=') {
							croatAlpa++;
							i++;
						}
					}
				}
			
		}
		System.out.println(croatArr.length-croatAlpa);
	}
}
