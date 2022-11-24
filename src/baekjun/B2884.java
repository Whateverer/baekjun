package baekjun;

import java.util.Scanner;

// 알람 시계
public class B2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if(min < 45) {
			hour = hour - 1 < 0 ? 24 - 1 : hour - 1;
			min = 60 - 45 + min;
		} else {
			min = min - 45;
		}
		System.out.println(hour + " " + min);
	}
}
