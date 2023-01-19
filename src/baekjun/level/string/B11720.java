package baekjun.level.string;

import java.util.Scanner;

public class B11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String count = sc.nextLine();
		String nums = sc.nextLine();
		
		char[] chars = nums.toCharArray();
		int sum = 0;
		for(char ch : chars) {
			int num = Character.getNumericValue(ch);
			sum += num;
		}
		System.out.println(sum);
	}
}
