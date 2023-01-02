package baekjun.level.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// OX퀴즈
public class B8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n; i++) {
			String testCase = sc.nextLine();
			char[] test = testCase.toCharArray();
			boolean isAnswer = false;
			int tmpSum = 0;
			int sum = 0;
			
			for(char c : test) {
				if(c == 'O') {
					if(isAnswer) {
						sum += ++tmpSum;
					} else {
						sum += ++tmpSum;
						isAnswer = true;
					}
				} else {
					tmpSum = 0;
					isAnswer = false;
				}
			}
			System.out.println(sum);
		}
	}
}
