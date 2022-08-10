package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baek2480 {

	static int[] arr = new int[3];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum=0;
		if(compare()==1) {
			sum = 10000+(arr[0]*1000);
		} else if(compare()==0) {
			sum = 1000+(arr[1]*100);
		} else {
			sum = arr[2]*100;
		}
		
		System.out.println(sum);
	} //main

	static int compare() {
		if(arr[0]==arr[1] &&arr[1]==arr[2]) {
			return 1;
		} else if(arr[0]!=arr[1] &&arr[1]!=arr[2]) {
			return -1;
		}
		return 0;
	}
}
