package backjun.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackJun1065HanSu {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int hanSu = 0;
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			//3자리 이전까지는 무조건 등차 수열을 만족하기 때문에 값 증가
			if(i<100)
			{
				hanSu++;
			}
			else
			{	
				int input = i;
				List eachNum = new ArrayList();
				List subNum = new ArrayList();
				boolean isHanSu = true;
				
				//각 자릿수의 숫자들을 하나씩 떼어 List에 넣음
				eachNum = eachNumber(input,eachNum);
				
				//각각의 숫자의 차를 다른 List에 하나씩 넣음
				for(int j=1;j<eachNum.size();j++) 
				{
					int item = (int) eachNum.get(j-1);
					int item2 = (int) eachNum.get(j);
					subNum.add(item-item2);
				}
				
				//차가 모두 같은 숫자면 등차수열, 하나라도 다르면 안됨
				for(int x=0;x<subNum.size();x++) 
				{
					if(subNum.get(0)!=subNum.get(x)) 
					{
						isHanSu = false;
					}
				}
				if(isHanSu==true) {
					hanSu++;
				}
			}
		}
		System.out.println(hanSu);
	}
	public static List eachNumber(int input, List eachNum) {
		
		int value = input % 10;
		input = input / 10;
		
		if(value==0 && input==0) 
		{
			return eachNum;
		}else {
			eachNum.add(value);
			eachNumber(input,eachNum);
		}
		
		return eachNum;
	}
}
