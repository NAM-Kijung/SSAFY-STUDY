package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek25304Buffer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = Integer.parseInt(br.readLine());
		int len = Integer.parseInt(br.readLine());
		
		int[] prices = new int[len];
		
		//공백 포함해서 받기..?
		int sum2=0;
		for(int i=0; i<len; i++) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			prices[i] = a*b;
			
			sum2 += prices[i];
		}
		
		System.out.println(sum==sum2? "Yes": "No");
		
//				Scanner sc = new Scanner(System.in);
//				
//				int sum = sc.nextInt();
//				int len = sc.nextInt();
//				
//				int[] prices = new int[len];
//				
//				int sum2=0;
//				for(int i=0; i<len; i++) {
//					int a = sc.nextInt();
//					int b = sc.nextInt();
//					prices[i] = a*b;
//					
//					sum2 += prices[i];
//				}
//				
//				System.out.println(sum==sum2? "Yes": "No");
//				sc.close();

	} //main

}
