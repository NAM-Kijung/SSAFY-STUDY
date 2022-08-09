package Swea;

import java.util.Scanner;

//전체 빈도수를 알면 해당값의 등수를 알 수 있다
//> 중간값, n번째 값을 알 수 있음
public class swea2063 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] cnt = new int[101];
		for(int i=0; i<N; i++) {
			int t = sc.nextInt();
			cnt[t]++;
		}
		
		int sum = 0;
//		int mid = (N+1)/2;
//		for (int i=0; i<cnt.length; i++) {
//			sum += cnt[i];
//			if(sum >= mid) {
//				System.out.println(i);
//				break;
//			}
//		}
		
		int mid = (N)/2;
		for (int i=0; i<cnt.length; i++) {
			sum += cnt[i];
			if(sum > mid) {
				System.out.println(i);
				break;
			}
		}
		
	} //main
}//end class