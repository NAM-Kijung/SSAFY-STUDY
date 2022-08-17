package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baek9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		Stack<Character> stack = new Stack<>();
		
		for(int t=0; t<T; t++) {
			String str = br.readLine();
			
			for(int i=0; i<str.length(); i++) {
				char c = str.charAt(i);
				
				if(c == '(') {
					stack.push(c);
				} else {
					if(!(stack.isEmpty())) {
						stack.pop();
					} else {
						stack.push(c);
						break;
					}
				}
			}
			
			if(stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
			stack.clear();
			
		}
		
	} //main

}