package backjun.com;

public class SortQuick {
	public static void main(String[] args) 
	{
		int[] sort = new int[5];
		
		
	}
	
	public static void quick(int[] arr, int start, int end)
	{
		int pivot = (start+end) / 2;
		int left = start;
		int right = end;
		
		while(true)
		{
			while(arr[left]>arr[pivot] || left==pivot) 
			{
				left++;
			}
			
			while(arr[right]<pivot || right==left)
			{
				right--;
			}
			
			if(right!=left)
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}else{
				int temp = arr[left];
				arr[left] = arr[pivot];
				arr[pivot] = temp;
				break;
			}
			
		}
		
	}
}
