package baekjun.level.array;

import java.util.Scanner;

// 평균은 넘겠지
public class B4344 {// long sum(int[] a)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = Integer.parseInt(sc.nextLine());
		for(int i=0; i<c; i++) {
			int cnt = sc.nextInt();
			int[] scores = new int[cnt];
			int sum = 0;
			int upAvgCnt = 0;
			for(int j=0; j<cnt; j++) {
				scores[j] = sc.nextInt();
				sum += scores[j];
			}
			double avg = (double) sum / cnt;
			for(int score : scores) {
				if(score > avg) {
					upAvgCnt++;
				}
			}
			double upAvg = (double) upAvgCnt / cnt * 100.0;  
			
			System.out.println(String.format("%.3f", upAvg) + "%");
		}
	}
}
