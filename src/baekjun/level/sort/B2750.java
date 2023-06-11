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
//        Arrays.stream(array).sorted().forEach(System.out::println);

        // 동빈나 선택정렬
        for (int i = 0; i < count; i++) {
            int min = 1001;
            int index = 0;
            for (int j = i; j < count; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }

}
