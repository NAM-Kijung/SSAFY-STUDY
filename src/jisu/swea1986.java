package jisu;

import java.util.Scanner;

public class swea1986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int sum1=0;
			int sum2=0;
			for(int i=1; i<=N; i++) {
				if(i%2 == 1) {
					sum1 += i;
				}else if(i%2 == 0) {
					sum2 -= i;
				}
			}
			System.out.println("#"+t+" "+(sum1+sum2));
		}
	}//main
}//end class