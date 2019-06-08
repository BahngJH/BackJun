package backjun.com;

import java.util.Scanner;

public class BackJun1931MeetingRoom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalCase = sc.nextInt();
		int index = 0;
		int[] startTime = new int[totalCase];
		int[] endTime = new int[totalCase];
		int min = 0;
		
		//배열첨자 임시 저장
		int temp = 0;
		//배열값 임시저장
		int valTemp =0;
		
		while(index!=totalCase)
		{
			startTime[index] = sc.nextInt();
			endTime[index] = sc.nextInt();
			index++;
		}
		
		//선택 정렬로 endTime 오름차순 정렬
		//endTime의 기준으로 startTime도 같이 정렬
		for(int i=0; i<totalCase-1; i++) 
		{
			min = endTime[i];
			
			for(int j=i;j<totalCase; j++)
			{
				if(min>endTime[j])
				{
					min = endTime[j];
					temp = j;
				}
			}
			//최저값 찾았을 때 로직 수행
			if(temp!=0) 
			{	
				valTemp = endTime[temp];
				endTime[temp] = endTime[i];
				endTime[i] = valTemp;
				
				valTemp = startTime[temp];
				startTime[temp] = startTime[i];
				startTime[i] = valTemp;
			}
			temp = 0;
		}
		int result = 1;
		int dard = endTime[0];
		
		for(int i=1; i<totalCase; i++)
		{
			if(startTime[i] >= dard)
			{
				dard = endTime[i];
				result++;
			}
		}
		System.out.println(result);
	}
}
