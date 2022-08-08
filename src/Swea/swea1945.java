package Swea;

import java.util.Scanner;

public class swea1945 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int num = sc.nextInt();
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			int e=0;
			while(num != 1) {
				if(num%2 == 0) { a++; num=num/2;}
				if(num%3 == 0) { b++; num=num/3;}
				if(num%5 == 0) { c++; num=num/5;}
				if(num%7 == 0) { d++; num=num/7;}
				if(num%11 == 0) { e++; num=num/11;}	
			}
				System.out.printf("#%d  %d  %d  %d  %d  %d\n",t,a,b,c,d,e);
		}
	}// main
} //end class