package baekjun;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 전체 학생 수 n
        // 잃어버린 학생 배열 lost
        // 빌려줄 수 있는 배열 reserve
        
        // lost에 있는 번호의 학생에게 reserve의 학생이 빌려줘야 함
        int count = 0;
        outer : for(int i : reserve) { 
        	int index = 0;
            for(int j : lost) { 
                if(i - 1 == j) {
                    count++;
                    lost[index] = -1;
                    continue outer;
                } else if(i + 1 == j) {
                    count++;
                    lost[index] = -1;
                    continue outer;
                }
                index++;
                System.out.println(Arrays.toString(lost));
            }
        }
        answer = n - lost.length + count;
        return answer;
    }
	public static void main(String[] args) {
		체육복 c = new 체육복();
		int[] lost = {2, 4};
		int[] reserve = {3};
		int result = c.solution(5, lost, reserve);
		System.out.println(result);

	}

}
