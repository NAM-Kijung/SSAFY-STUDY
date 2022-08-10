package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baek8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=0; t<T; t++) {
			int result=0;
			int score =0;
			String ox = sc.next();
			char[] arr = ox.toCharArray();
			int len = arr.length;
			
			for(int i=1; i<=len; i++) {
				if((arr[i-1] == 'O')) {
					score++;
					result += score;
				} else if(arr[i-1] == 'X') {
					score=0;
				}
			}
			
			System.out.println(result);
		}
		sc.close();
		
	} //main

}
