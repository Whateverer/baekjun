package baekjun;

import java.util.Scanner;

// 주사위 세개
public class B2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int[] nums = {num1, num2, num3};
		int prize = 0;
		
		if(num1 == num2 && num2 == num3 && num1 == num3) {
			prize = 10000 + num1 * 1000;
		} else if (num1 == num2) {
			prize = 1000 + num1 * 100;
		} else if (num2 == num3) {
			prize = 1000 + num2 * 100;
		} else if (num1 == num3) {
			prize = 1000 + num1 * 100;
		} else {
			int max = 0;
			for(int num : nums) {
				if(num > max) {
					max = num;
				}
			}
			prize = max * 100;
		}
		System.out.println(prize);
	}
}
