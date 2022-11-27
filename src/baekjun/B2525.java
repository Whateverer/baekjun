package baekjun;

import java.util.Scanner;

public class B2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int diff = sc.nextInt();
		if(min + diff >= 60) {
			int sum = min + diff;
			int plus = sum / 60;
			min = sum % 60;
			hour = hour + plus >= 24 ? hour + plus - 24 : hour + plus;
		} else {
			min = min + diff;
		}
		
		System.out.println(hour + " " + min);
	}
}
