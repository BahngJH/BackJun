package backjun.com;

public class BackJun4673SelfNum {
	static int count = 0;
	
	public static void main(String[] args) 
	{
		int[] notSelf = new int[10000];
		boolean isSelf = false;
		notSelf = self(1,notSelf);
		
		for(int i=0;i<10000;i++) 
		{
			for(int j=0;j<notSelf.length;j++)
			{
				if(i==notSelf[j]) 
					isSelf=true;
			}
			
			if(isSelf==false)
				System.out.println(i);
			isSelf=false;
		}
		
	}
	
	public static int[] self(int num, int[] notSelf) 
	{
		if(num>10000) 
		{
			return notSelf;
		}
		else 
		{
			
			int temp = num;
			int sum=0;
			while(temp!=0) 
			{
				sum+=temp%10;
				temp=temp/10;
			}
			
			sum+=num;
			
			if(sum<10000) 
			{
				notSelf[++count] = sum;
			}
			
			self(++num,notSelf);
		}
		return notSelf;
	}
}
