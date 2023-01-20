package baekjun.level.string;

import java.util.Scanner;

public class B10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(s.indexOf(ch) + " ");
		}
	}
}
