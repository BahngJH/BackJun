package backjun.com;

import java.util.Scanner;

public class BackJun10250HotelACM {
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int testNum = sc.nextInt();
		sc.nextLine();
		String[] result = new String[testNum];
		int resultNum = 0;
		
		while(testNum!=resultNum)
		{
			String input = sc.nextLine();
			String[] data = input.split(" ");
			
			int row = Integer.parseInt(data[0]);
			int colum = Integer.parseInt(data[1]);
			int customer = Integer.parseInt(data[2]);
			
			int searchNum = 1;
			boolean isStop = false;
			
			for(int i=0;i<colum;i++)
			{
				for(int j=0;j<row;j++)
				{
					//배열 증가할 때 마다 searchNum을 증가 시켜서 일치할 때
					if(searchNum == customer)
					{
						//result배열에 해당하는 호실 저장하는 메서드 호출
						result = saveHotel(i,j,result,resultNum);
						
						//반복문 종료 플래그
						isStop = true;
						break;
					}
					//값을 못 찾으면 증가
					searchNum++;
				}
				//값 찾으면 for문 즉시 종료
				if(isStop==true)
					break;
			}
			//한 번의 케이스 끝
			resultNum++;
		}
		for(String i:result)
			System.out.println(i);
	}

	public static String[] saveHotel(int i, int j, String[] result, int resultNum) 
	{
		//i와 j가 0부터 시작했으니 1씩 증가시킴
		i++;
		j++;

		String front = String.valueOf(j);
		String back ="";
		
		//10 보다 작을 땐 앞에 0을 붙이고 추가
		if(i<10) 
			back += "0"+String.valueOf(i);
		else 
			back = String.valueOf(i);
		
		//두 문자열 합쳐서 결과 배열에 저장
		String val = front+back;
		result[resultNum] = val;
		
		return result;
	}
}
