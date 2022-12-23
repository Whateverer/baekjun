package baekjun.level.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 과제 안 내신 분?
public class B5597 {
	public static void main(String[] args) {
		Integer[] all = new Integer[30];
		Integer[] students = new Integer[28];
		List<Integer> miss = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<students.length; i++) {
			students[i] = sc.nextInt();
		}
		
		for(int i=1; i<=all.length; i++) {
			all[i-1] = i;
		}
		
		for(int i: all) {
			List<Integer> list = Arrays.asList(students); 
			boolean x = list.contains(i);
			if(!x) {
				miss.add(i);
			}
		}
		
		Collections.sort(miss);
		
		for(int i:miss) {
			System.out.println(i);
		}
		
	}
}
