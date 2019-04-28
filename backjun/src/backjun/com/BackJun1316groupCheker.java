package backjun.com;

import java.util.Scanner;

public class BackJun1316groupCheker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseNum = sc.nextInt();
		sc.nextLine();
		int result = caseNum;
		boolean ischeck = true;
		
		
		while(caseNum > 0)
		{
			String input = sc.nextLine();
			char[] inputArr = input.toCharArray();
			char[] check = new char[inputArr.length];
			int checkNum = 0;
			
			for(int i=1;i<inputArr.length;i++)
			{
				//문자가 연속되지 않은 경우 검사하기
				if(inputArr[i-1]!=inputArr[i])
				{
					//연속되지 않는 문자가 전에 나온건지 check배열에 검사
					for(int j=0; j<check.length; j++)
					{
						if(inputArr[i-1]==check[j])
							ischeck = false;
						
						//중복된게 있으면 반복문 중지시켜서 시간 단축
						if(ischeck==false)
							break;
					}
					//중복된 문자가 아니라면 연속된 문자가 아니니 check에 문자 추가
					check[++checkNum] = inputArr[i-1];
				}
				
				//aba에서 마지막은 체크 안하길래 마지막 요소도 체크하게 예외처리
				if(i==inputArr.length-1)
				{
					for(int j=0;j<check.length;j++) 
					{
						if(inputArr[i]==check[j]) 
						{
							ischeck = false;
							break;
						}
					}
				}
				
				if(ischeck==false) 
				{
					result--;
					break;
				}
			}
			caseNum--;
			ischeck = true;
		}
		System.out.println(result);
		
	}
}
