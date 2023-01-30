package baekjun.level.string;

import java.util.Scanner;

public class B2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCnt = sc.nextInt();
		for(int i=0; i<testCnt; i++) {
			int r = sc.nextInt(); 
			String s = sc.next();
			
			for(int k=0; k<s.length(); k++) {
				for(int j=0; j<r; j++) {
					System.out.print(s.charAt(k)); 
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
