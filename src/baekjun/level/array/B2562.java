package baekjun.level.array;

import java.util.Scanner;

// 최댓값
public class B2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}
