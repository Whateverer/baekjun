package baekjun;

import java.util.*;

public class B1003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] chess = {1,1,2,2,2,8};
        int[] result = new int[6];
        for(int i=0; i<6; i++) {
        	result[i] = chess[i] - sc.nextInt();
        }
        for(int res : result) {
        	System.out.print(res + " ");
        }
    }
}
