package jisu;

import java.util.Scanner;

public class baek2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int num = A*B*C;
		int[] arr = new int[10];
		
		while(num>0) {
			int idx = num%10;
			arr[idx]++;
			num = num/10;
		}
		
		for(int a:arr) {
			System.out.println(a);
		}
	} //main
} //end class

// ABC Scanner
// A*B*C
// int[] arr = new int[10];
// 반복 int idx=(A*B*C)% 10 
//      num = (A*B*C) / 10
//		arr[idx]++
//  num>0
// for(int a:arr) println(a)
//

