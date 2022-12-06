package baekjun;

import java.util.Scanner;

// 영수증
public class B25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int count = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= count; i++) {
			int unitPrice = sc.nextInt();
			int unitCount = sc.nextInt();
			sum += unitPrice * unitCount;
		}
		if(sum == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
