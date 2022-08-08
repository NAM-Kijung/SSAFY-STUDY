package Swea;

import java.util.Scanner;

public class sewa1288 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
         
        for(int t=1; t<=T; t++) {
            int N = sc.nextInt();
             
            boolean check = false;
            int i=0;
            int[] tmp = new int[10];
             
            do {
                int num= N*(++i);
 
                while(num>0) {
                    int idx = num%10;
                    tmp[idx]++;
                    num = num/10;
                } // while
                 
                int cnt = 0;
                for(int j=0; j<10; j++) {
                    if(tmp[j] >= 1) cnt++;
                } //for
                 
                check = (cnt == 10? true : false);
                 
            } while(check != true); 
             
            System.out.println("#"+t+" "+((i)*N));
        } //for - T번 반복

	}

}
