package Swea;

import java.util.Scanner;

public class swea1204_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int tn = sc.nextInt();
			
			// 학생들의 점수 카운트 배열 scores[]
			int[] scores = new int[101];
			
			int idx =0;
			for(int i=0; i<1000; i++) {
				idx = sc.nextInt();
				scores[idx]++;
			}
			
			// scores[] 배열에서 최대값 찾기
			// 그 최대값의 인덱스가 정답
			int max = 0;
			int result = 0;
			for(int j=0; j<scores.length; j++) {
				if(max<=scores[j]) {
					max = scores[j];
					if(result<=j) {
						result = j;
					}
				}
			}

			System.out.println("#"+tn+" "+result);
		}
		
	} //main
}//end class






// 각 점수를 arg[]에 입력 받는다
// arg[]의 값이 scores 인덱스로 즉, scores[arg[]]++;
// scores 의 값이 가장 큰 것 찾기