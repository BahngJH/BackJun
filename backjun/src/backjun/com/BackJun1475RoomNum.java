package backjun.com;

import java.util.Scanner;

public class BackJun1475RoomNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int room = sc.nextInt();
		int[] check = new int[10];
		int max = 1;
		
		while(room!=0)
		{
			check[room % 10]++;
			room /= 10;
		}
		
		//6과 9 처리해서 6에다가만 값 넣음
		int avg = (int)Math.round((check[6]+check[9]) / 2.0);
		check[6] = avg;
		
		//0~8까지만 비교
		for(int i=0;i<9;i++)
		{
			if(check[i]>max)
				max = check[i];
		}
		System.out.println(max);
	}
}
