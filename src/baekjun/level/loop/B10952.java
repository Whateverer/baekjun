package baekjun.level.loop;

import java.util.Scanner;

// A+B - 5
public class B10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		do {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			System.out.println(a+b);
		} while(a != 0 && b != 0);
	}
}
