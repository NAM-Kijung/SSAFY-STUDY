package Swea;

import java.util.Scanner;

public class swea1284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			
			int sum1=0;
			sum1=W*P;
			
			int sum2=0;
			sum2= (W<=R?Q:Q+(W-R)*S);
			
			if(sum1<sum2) {
				System.out.printf("#%d %d\n",t,sum1);
			} else {
				System.out.printf("#%d %d\n",t,sum2);
			}
		}
	} //main
} //end class