package Baekjoon;

import java.util.Scanner;

public class Baek1110 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int num = 0;
		int cnt = 0;
		
		// 첫 1회는 하고 while문으로
		int lnum = N/10;
		int rnum = N%10;

		while(true) {
			int tmp = lnum + rnum;
			if(tmp>=10) 
				tmp = tmp%10;
			num = (10*rnum) + tmp;				
			cnt++;
			
			if(N == num) {
				System.out.println(cnt);
				break;
			}

			lnum = num/10;
			rnum = num%10;
			
		}
		
	} //main
} //end class

//각 자리수를 구한다
//a 일의 자리 수 = 모듈러
//b 십의 자리 수 = 10으로 나눈 몫
//a+b
//c (a+b)의 가장 오른쪽 자리 수 = 10으로 나눈 나머지
//num = 10*b + c
//cnt++;