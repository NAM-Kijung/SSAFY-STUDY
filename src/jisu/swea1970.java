package jisu;

import java.util.Scanner;

public class swea1970 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         
        for(int t=1; t<=T; t++) {
            int N = sc.nextInt();
             
            int a = N/50000;
            N = N%50000;
            int b = N/10000;
            N = N%10000;
            int c = N/5000;
            N = N%5000;
            int d = N/1000;
            N = N%1000;
            int e = N/500;
            N = N%500;
            int f = N/100;
            N = N%100;
            int g = N/50;
            N = N%50;
            int h = N/10;
            N = N%10;
             
            System.out.printf("#%d\n%d %d %d %d %d %d %d %d\n", t,a,b,c,d,e,f,g,h);
        }
	} //main
} //end class
