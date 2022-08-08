package jisu;

import java.util.Scanner;

public class Swea2068 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1; i <= T; i++) {
            int max = 0;
            for(int j=0; j<10; j++) {
                int num = sc.nextInt();
                if(num > max) {
                    max = num;
                }
            } //for
        System.out.println("#"+i+" "+max);
        } //for
		
        
        
//        Scanner sc = new Scanner(System.in);
//        
//        int T = sc.nextInt();
//        
//        for(int t = 1; t<=T; t++) {
//        	int[] arr = new int[10];
//        	for(int i=0; i<10; i++) {
//        		arr[i] = sc.nextInt();
//        	} // arr배열에 값 넣기
//        	
//        	int max=0;
//        	for(int i=0; i<arr.length; i++ ) {
//        		if(arr[i] > max) {
//        			max = arr[i];
//        		}
//        	} // 값 비교, 큰수는 max에 담기
//        	System.out.println("#"+t+" "+max);
//        } // for: T만큼 반복
        
        
	} //main
} //end class