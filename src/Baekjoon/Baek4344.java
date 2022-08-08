package Baekjoon;

import java.util.Scanner;

public class Baek4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int t=0; t<C; t++) {
			int stu = sc.nextInt();
			
			int[] scores = new int[stu];
			double sum = 0;
			for(int i=0; i< scores.length; i++) {
				scores[i] = sc.nextInt();
				sum += scores[i];
			}
			double avg = sum/stu;
			
			int cnt = 0;
			for(int score : scores) {
				if(score>avg) {
					cnt++;
				}
			}
			
			double percent = (double)cnt/stu*100;
			System.out.println(String.format("%.3f", percent)+"%");
		}
		
	} //end class
} //main

//총 5 T번 반복
//	학생 수 만큼 배열 생성
//	평균 구하기
//	평균 넘는 학생 수 찾기 변수 cnt
//	cnt/학생 수*100