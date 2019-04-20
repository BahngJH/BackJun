package backjun.com;

import java.util.Scanner;

public class BackJun1152wordCount {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		int result=0;
		
		String[] word = msg.split(" ");
		for(int i=0;i<word.length;i++) 
		{
			if(!word[i].equals(""))
				result++;
		}
		System.out.println(result);
	}
}
