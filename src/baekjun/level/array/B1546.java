package baekjun.level.array;

import java.util.Arrays;
import java.util.Scanner;

// 평균
public class B1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] arr = new double[n];
		
		double max = 0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextDouble();
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		double sum = 0;
		for(int i=0; i<n; i++) {
			arr[i] = arr[i] / max * 100;
			sum += arr[i];
		}
		System.out.println(sum / n); 
		
	}
}
