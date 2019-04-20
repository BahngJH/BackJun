package backjun.com;

import java.util.Scanner;

public class BackJun10039AvgScore {
	public static void main(String[] args) {
		
		int[] score = new int[5];
		int sum =0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			int grade = sc.nextInt();
			if(grade<40) {
				sum+=40;
			}else {
				sum+=grade;
			}
		}
		System.out.println(sum/5);
	}
}
