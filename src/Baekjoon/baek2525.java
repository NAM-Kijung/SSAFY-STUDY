package Baekjoon;

import java.util.Scanner;

public class baek2525 {

	public static void main(String[] args) {

		//먼저 현재 시각의 분과 필요한 시간 분을 더한다
		//60을 넘으면 현재 시각 시++ 분은 -60
		//	만약 시간이 24를 같거나 넘었다면 시-24/
		
		Scanner sc = new Scanner(System.in);
		
		int nowH = sc.nextInt();
		int nowM = sc.nextInt();
		int needM = sc.nextInt();
		
		int m = nowM + needM;
		while(m>=60) {
			nowH++;
			m = m-60;

			if(nowH>=24) nowH = nowH-24;
		}
		
		System.out.println(nowH+" "+m);
		
	} //main

}
