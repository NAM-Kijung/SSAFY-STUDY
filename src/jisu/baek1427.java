package jisu;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class baek1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		int num = sc.nextInt();
		
		while(num >= 1) {
			list.add(num%10);
			num = num/10;
		}
		
		list.sort(Comparator.reverseOrder());
		for(int a: list) {
			System.out.print(a);
		}
	} //main
} //end class
