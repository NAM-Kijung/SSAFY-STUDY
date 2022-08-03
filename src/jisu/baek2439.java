package jisu;

import java.util.Scanner;

public class baek2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i=0; i<num; i++) {
			for(int j=num-1; j>=0;j--) {
				if(j>i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			} //for-j
			System.out.println();
		} //for-i
	} //main
} //end class
