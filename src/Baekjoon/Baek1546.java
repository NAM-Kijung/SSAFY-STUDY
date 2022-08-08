package Baekjoon;

import java.util.Scanner;

public class Baek1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int max =0;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		double[] arr2 = new double[N];
		for(int i=0; i<N; i++) {
			arr2[i] = (double)arr[i]/max*100;
		}
		
		double sum =0;
		for(double a : arr2) {
			sum += a;
		}
		
		System.out.println(sum/N);
		
	} //main
} //end class

//값을 배열에 담는다
//최대값을 고른다
//		1) max와 arr[i] 원소를 하나씩 비교한다
//      2) 비교해서 큰 값을 max에 담는다
//모든 수 하나씩/최대값*100
//위의 수들의 합/N을 한다