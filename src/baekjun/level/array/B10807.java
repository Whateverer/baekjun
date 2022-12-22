package baekjun.level.array;

import java.util.Scanner;

public class B10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int findNum = sc.nextInt();
		int count = 0;
		for(int i : arr) {
			if(findNum == i) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
