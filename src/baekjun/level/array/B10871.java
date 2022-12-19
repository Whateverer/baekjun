package baekjun.level.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class B10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i : arr) {
			if(i < x) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		
	}
}
