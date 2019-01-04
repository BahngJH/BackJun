package backjun.com;

import java.util.Scanner;

public class Back2839 {
	public static void main(String[] args) {
		
		//설탕배달 하기
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int muk = 0, namugi = 0, result = 0;

		namugi = n % 5;
		muk = n / 5;
		result += muk;

		if (namugi == 0) {
			System.out.println(result);
			return;
		} else {
			for (int i = n; i > 0; i--) {
				int temp = (n - i * 5);
				if (temp > 0 && temp % 3 == 0) {
					result = i;
					result += temp / 3;
					System.out.println(result);
					return;
				}
			}

		}
		namugi = n % 3;
		
		if (namugi == 0) {
			muk = n / 3;
			result = muk;
			System.out.println(result);
			return;
		} else {
			System.out.println(-1);
			return;
		}

	}
}
