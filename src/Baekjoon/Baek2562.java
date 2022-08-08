package Baekjoon;

import java.util.Scanner;

public class Baek2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		int idx = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				idx = i;
			}
		} //for
		
		System.out.print(max+"\n"+(idx+1));
	} //main
} //end class
