package baekjun.level.loop;

import java.util.Scanner;

public class B2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=1; i<=count; i++) {
			for(int j=1; j<=count; j++) {
				if(j==count || count-i < j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
