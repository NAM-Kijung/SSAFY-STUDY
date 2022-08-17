package Swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class swea8931 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int t=1; t<=T; t++) {
			// K 입력 받고
			int K = Integer.parseInt(br.readLine());
			
			// 스택에 넣고 빼고
			for(int k=0; k<K; k++) {
				int a = Integer.parseInt(br.readLine());
				
				if(a != 0) {
					stack.push(a);
				} else {
					if(!(stack.isEmpty())) {
						stack.pop();
					} else {
						continue;
					}
				}
			}
			
			int sum=0;
			while(!(stack.isEmpty())) {
				sum += stack.pop();
			}
			
			System.out.println("#"+t+" "+sum);
		}
		
	} //main

}
