package baekjun;

import java.util.Arrays;

public class 기사단원의무기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		기사단원의무기 무기 = new 기사단원의무기();
		무기.solution(10, 3, 2);
		
	}
	
	public int solution(int number, int limit, int power) {
		int answer = 0;
		int[] arr = new int[number];
		
		// 각각의 약수 개수 구하기
		for(int i=0; i<number; i++) {
			int cnt = getDivisor(i+1);
			arr[i] = cnt;
		}
		// 검증하기
		for(int n : arr) {
			if(n > limit) n = power;
			answer += n;
		}
		
		return answer;
	}

	// 약수 구하는 method 
	public int getDivisor(int num) {
		int cnt = 0;
		for(int i=1;i*i<=num;i++) {
			if(i*i == num) cnt++;
			else if(num % i == 0) cnt += 2;
		}
		return cnt;
	}
}
