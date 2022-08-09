package Swea;

import java.util.Scanner;

public class swea1984 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[10];
		
		for(int t=1; t<=T; t++) {
			
			//배열에 값 대입
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			// 배열 정렬하기
//			1. 버블정렬
//			int tmp=0;
//			for(int i =0; i<arr.length-1; i++) {
//				for(int j=0; j<arr.length-1-i; j++) {
//					if(arr[j] > arr[j+1]) {
//						tmp = arr[j];
//						arr[j] = arr[j+1];
//						arr[j+1] = tmp;
//					}
//				}
//			} //for
			
//			2. 선택 정렬로 풀어보기
//			for() {
//				
//			}
			
			
			
			
			//나머지 평균값 구하기
			int sum = 0;
			for(int i=1; i<arr.length-1; i++) {
				sum += arr[i];
			}
			
			double result = (double)sum/(arr.length-2);
			System.out.println("#"+t+" "+Math.round(result));
		} //for: T번 반복
		
		
	} //main
} //end class

// 정렬
// 맨 앞뒤 제외 나머지로 평균값 구하기