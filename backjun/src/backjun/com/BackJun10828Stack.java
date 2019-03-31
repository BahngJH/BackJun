package backjun.com;

import java.util.Scanner;

public class BackJun10828Stack {
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int top = 0;
		System.out.println("스택 공간을 정하세요");
		int stackSize = sc.nextInt();
		sc.nextLine();
		int[] stack = new int[stackSize];
		
		while(true) 
		{
			System.out.println("명령어를 입력하세요");
			String command = sc.nextLine();
			
			
			if(command.equals("push")) 
			{
				top++;
				if(top>stackSize) 
				{
					System.out.println("스택 오버플로우");
					top--;
				}else {
					System.out.println("입력할 데이터를 쓰시오");
					int input = sc.nextInt(); sc.nextLine();
					stack[top] = input;
				}
			}
			
			else if(command.equals("pop")) 
			{
				if((top-1)<0) 
				{
					System.out.println("-1");
				}
				else {
					System.out.println(stack[top]);
					top--;
				}
			}
			
			else if(command.equals("top")) 
			{
				if(top>0)
					System.out.println(stack[top]);
				else //스택이 비어있으면 -1 출력
					System.out.println("-1");
			}
			
			else if(command.equals("size")) 
			{
				System.out.println(top);
			}
			
			else if(command.equals("empty")) 
			{
				if(top>0)
					System.out.println("0");
				else
					System.out.println("1");
			}
		}
		
	}
}
