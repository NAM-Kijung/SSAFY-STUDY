package Swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 달팽이 숫자
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		
		int T = Integer.parseInt(br.readLine());
		int[][] arr;
		
		for(int t=1; t<=T; t++) {
			int r=0;
			int c=0;
			int num = 0;
			int n = Integer.parseInt(br.readLine());
			arr = new int[n][n];
			
			do {
				arr[r][c] = ++num;
				while(c != n-1 && arr[r][c+1] == 0) {
					c++;
					arr[r][c] = ++num;
				}
				while(r != n-1 && arr[r+1][c] == 0) {
					r++;
					arr[r][c] = ++num;
				}
				while(c != 0 && arr[r][c-1] == 0) {
					c--;
					arr[r][c] = ++num;
				}
				while(r != 0 && arr[r-1][c] == 0) {
					r--;
					arr[r][c] = ++num;
				}
				c++;
			} while(r<n-1 && c<n-1 && arr[r][c] == 0);
			
			
			sb = new StringBuilder();
			sb.append("#"+t+"\n");
			for(int[] tmp:arr) {
				for(int a:tmp) {
					sb.append(a+" ");
				}
				sb.delete(sb.length()-1, sb.length());
				sb.append("\n");
			}
			
			System.out.print(sb);
			
		}
		
		br.close();

	} //main

}
