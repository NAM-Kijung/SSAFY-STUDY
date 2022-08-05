package baekjoon;

import java.util.Scanner;

public class Main2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int time = sc.nextInt();
		
		// 60분으로 나눈 몫을 A에 더할 것
		int a = time/60;
		// 60으로 나눈 몫을 B에 더할 것
		int b = time%60;
		
		
		// 문제가 되는 부분
		// 1. A+a가 24가 넘어갈 때. B+b한 값이 60이 넘어서 A+a에 1을 더했는데 시간이 24시가 넘어갈 때

		//숫자가 24가 넘어가면 예외를 넣어야 하므로 생성
		int c = (A+a+((B+b)/60));
		// B+b가 60이 넘을 경우 나머지를 분에 넣어야 되므로 생성.
		int d = ((B+b)%60);
		
		if(c>=24){
			//B+b가 60이 넘으니 1을 더해줘서 A를 0으로 만듦.
			A = c - 24;
			System.out.println(A + " " + d);
		} else {
			System.out.println(c +" "+ d);
		}
	}
}
