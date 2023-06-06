package baekjun.level.sort;

import java.util.Arrays;
import java.util.Scanner;

public class B2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.stream(array).sorted().forEach(System.out::println);
    }
}
