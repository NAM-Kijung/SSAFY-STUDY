package Swea;

import java.util.Arrays;
import java.util.Scanner;

public class swea1208 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//  10번 반복
		for(int T=1; T<=10; T++) {
			int work = sc.nextInt();
			int[] boxes = new int[100];
			
			for(int i=0; i<100; i++) {
				boxes[i] = sc.nextInt();
			}
			
			// 작업횟수만큼 반복
			for(int t=work; t>0; t--) {
				Arrays.sort(boxes);
				boxes[99] = boxes[99] - 1;
				boxes[0] = boxes[0] + 1;
			}
			
			Arrays.sort(boxes);
			
			int result = boxes[99] - boxes[0];
			System.out.println("#"+T+" "+result);
		}
	} //main
} //end class
