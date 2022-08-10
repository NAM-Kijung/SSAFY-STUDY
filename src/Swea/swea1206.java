package Swea;

import java.util.Arrays;
import java.util.Scanner;

public class swea1206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			//배열에 저장
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int result = 0;
			int[] tmp = null;
			
			for(int i=2; i<=arr.length-3; i++) {
				//타겟 원소 구하기 = 5개 중 최대값
				if(arr[i]>arr[i-1] && arr[i]>arr[i+1] && arr[i]>arr[i-2] && arr[i]>arr[i+2]) {
					//양 옆네  수 중 최대값 구하기
					tmp = new int[] {arr[i-2], arr[i-1], arr[i+1], arr[i+2]};
					Arrays.sort(tmp);
					result += (arr[i]-tmp[3]);
				}
			}
			System.out.println("#"+t+" "+result);
		}

	} //main

}
