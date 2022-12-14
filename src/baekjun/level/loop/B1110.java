package baekjun.level.loop;

import java.io.IOException;
import java.util.Scanner;

// 더하기 사이클
public class B1110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int initInt = sc.nextInt();
		int temp = initInt;
		int sum = 0;
		int count = 0;
		do {
			sum = temp / 10 + temp % 10;
			temp = temp % 10 * 10 + sum % 10;
			
			count ++;
		} while(temp != initInt); 
		System.out.println(count);
		
	}
}
