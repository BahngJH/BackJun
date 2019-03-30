package backjun.com;

public class BackJun2750 {
	public static void main(String[] args) 
	{
		int[] arr = {5,5,2,3,4,1};
		//int[] arr = {5,7,2,3,40,22,4,1,10,20};
		//int[] arr = {9,8,7,6,5,4,3,2,1};
		
		int index = 0;
		
//		for(int i=0;i<arr.length;i++) 
//		{
//			int min = arr[i];
//			
//			for(int j=i;j<arr.length;j++) 
//			{
//				if(arr[j]<min) 
//				{
//					min = arr[j];
//					index = j;
//				}
//			}
//			if(arr[i]!=min) 
//			{
//				arr[index] = arr[i];
//				arr[i] = min;
//			}
//			
//			for (int x : arr) 
//			{
//				System.out.print(x+" ");	
//			}
//			System.out.println();
//		}
		//여기 까지 선택정렬 구현
		
		
		int arrLength = arr.length;
		int temp = 0;
		while(arrLength>0) 
		{
			for(int i=0;i<arrLength-1;i++) 
			{
				if(arr[i]>arr[i+1]) 
				{
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
			for(int i:arr) {
				System.out.print(i+" ");
			}
			System.out.println();
			arrLength--;
		}
		//여기까지 버블 정렬
		
	}
}
