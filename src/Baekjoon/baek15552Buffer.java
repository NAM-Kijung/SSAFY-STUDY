package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//다시 풀기
public class baek15552Buffer {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		
		// 문자열로 받고 split메소드를 이용해서 공백을 기준으로 잘라서 활용
		// integer.parseInt() 형변환을 통해 사용.
		for(int t=0; t<T; t++) {
			String[] a = br.readLine().split(" ");
			int b = Integer.parseInt(a[0]);
			int c =Integer.parseInt(a[1]);
//			int[] arr = Integer.parseInt(br.readLine().split(" "));   XXXXX
			System.out.println(b+c);
		}
	} //main

}
