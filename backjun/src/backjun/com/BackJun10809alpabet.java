package backjun.com;

import java.util.Scanner;

public class BackJun10809alpabet {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String alpa = sc.nextLine();
		
		//문자열 하나씩 쪼개는 방법
		char[] alpaArr = alpa.toCharArray();
		
		int[] result = new int[26];
		for(int k=0;k<26;k++) {
			result[k]=-1;
		}
			
		
		for(int i=0;i<alpaArr.length;i++) 
			
		{
			for(int j=0;j<26;j++) 
			{
				if(result[j]==-1)
					if((int)alpaArr[i]==j+97) 
						result[j]=i;
			}
		}
		for(int i:result)
			System.out.print(i+" ");
	}
}
