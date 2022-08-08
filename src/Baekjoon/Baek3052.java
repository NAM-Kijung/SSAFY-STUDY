package Baekjoon;

import java.util.Scanner;

public class Baek3052 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[] arr = new int[42];
		for(int i=0; i<10; i++) {
			int num = sc.nextInt();
			int x = num % 42;
			arr[x]++;
		}
		
		int cnt=0;
		for(int i=0; i<42; i++) {
			if(arr[i]>0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	} //main
} //end class