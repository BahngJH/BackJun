package backjun.com;

import java.util.Scanner;

public class BackJun2750Sort {
	public static void main(String[] args) 
	{
		//int[] arr = {5,5,2,3,4,1};
		//int[] arr = {5,7,2,3,40,22,4,1,10,20};
		//int[] arr = {6,5,3,1,8,7,2,4};
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr = new int[length];
		int k = 0;
		
		while(length!=k)
		{
			arr[k] = sc.nextInt();
			k++;
		}
		
		int arrLength = arr.length;
		int temp = 0;
		int index = 0;
		
		for(int i=0;i<arr.length;i++) 
		{
			int min = arr[i];
			
			for(int j=i;j<arr.length;j++) 
			{
				if(arr[j]<min) 
				{
					min = arr[j];
					index = j;
				}
			}
			if(arr[i]!=min) 
			{
				arr[index] = arr[i];
				arr[i] = min;
			}
			
//			for (int x : arr) 
//			{
//				System.out.print(x+" ");	
//			}
//			System.out.println();
		}
		for(int x: arr)
			System.out.println(x);
		
		//여기 까지 선택정렬 구현
		
//		while(arrLength>0) 
//		{
//			for(int i=0;i<arrLength-1;i++) 
//			{
//				if(arr[i]>arr[i+1]) 
//				{
//					temp = arr[i+1];
//					arr[i+1] = arr[i];
//					arr[i] = temp;
//				}
//			}
//			for(int i:arr) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//			arrLength--;
//		}
		//여기까지 버블 정렬
		
		
//		for(int i=1;i<arr.length;i++) 
//		{	
//			for(int j=i;j>0;j--) 
//			{
//				//System.out.println(arr[j-1]+" : "+arr[j]);
//				if(arr[j-1]>arr[j]) 
//				{
//					temp = arr[j];
//					arr[j] = arr[j-1];
//					arr[j-1] = temp;
//				}
//			}
//			
//			for(int k:arr) 
//			{
//				System.out.print(k+" ");
//			}
//			System.out.println();
//		}
		//여기까지 삽입정렬
		
	}
}
