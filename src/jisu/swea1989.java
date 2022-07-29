package jisu;

import java.util.Scanner;

public class swea1989 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			String str = sc.next();
			char[] tmp = str.toCharArray();
			boolean check = false;
			for (int i=0; i<str.length(); i++) { 
				if(tmp[i] == tmp[str.length()-1-i]) {
					check = true;
				} else {
					check = false;
				}
				
			}
			
			if (check == true ) {
				System.out.printf("#%d %d\n", t, 1);
			} else {
				System.out.printf("#%d %d\n", t, 0);
			}
		}
	} //main
} //end class