package baekjun.level.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// 나머지
public class B3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> arr = new ArrayList<Integer>();
		
		for(Integer i=0; i<10; i++) {
			arr.add(sc.nextInt() % 42);
		}
		
		Set<Integer> set = new HashSet<>(arr);
		System.out.println(set.size());
	}
}
