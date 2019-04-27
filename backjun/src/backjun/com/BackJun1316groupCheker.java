package backjun.com;

import java.util.Scanner;

public class BackJun1316groupCheker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		char[] checker = input.toCharArray();
		char[] ckword = new char[checker.length];
		boolean ischecker = true;
		int ckNum = 0;
		int result = 0;
		
		for(int i=1;i<checker.length;i++) 
		{
			if(checker[i-1]!=checker[i]) 
			{
				for(int j=0;j<ckword.length;j++) 
				{
					if(ckword[j]==checker[i-1]) 
					{
						ischecker=false;
						break;
					}
				}
				ckword[ckNum++] = checker[i-1];
				
				if(ischecker==false) 
				{
					break;
				}
			}
		}
		if(ischecker==true)
			result++;
		System.out.println(result);
	}
}
