package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek3985 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(br.readLine());
		int[] rollcake = new int[L+1];
		int N = Integer.parseInt(br.readLine());
		
		//기대 조각 수
		int[] expect = new int[N];
		int emax=0;
		int expecti=0;

		//실제 조각 수
		int[] piece = new int[N];
		int pmax=0;
		int piecei=0;

		StringTokenizer st;
		for(int t=1; t<=N; t++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			//기대 조각 수
			expect[t-1] = end-start+1;
			if(emax < expect[t-1]) {
				emax = expect[t-1];
				expecti = t;
			}
			
			//실제 조각 수
			for(int i=start; i<=end; i++) {
				if(rollcake[i] == 0) {
					rollcake[i] = t;
					piece[t-1]++;
				}
			}
			
			if(pmax < piece[t-1]) {
				pmax = piece[t-1];
				piecei = t;
			}
			
		}
		System.out.printf("%d\n%d", expecti, piecei);
		
	} //main

}
