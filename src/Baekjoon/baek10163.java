package Baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek10163 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		int[][] arr = new int[1001][1001];
		int[] sum = new int[T];

		StringTokenizer st;
		for(int i=0; i<T; i++) {
			
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			
			for(int r=x; r<x+width; r++) {
				for(int c=y; c<y+height; c++) {
					arr[r][c] = i+1;
				}
			}
		}	
			
		int cnt=0;
		for(int i=0; i<T; i++) {
			for(int r=0; r<1001; r++) {
				for(int c=0; c<1001; c++) {
					if(arr[r][c] == i+1) {
						sum[i] = ++cnt;
					}
				}
			}
			cnt=0;
		}
		
		for(int a: sum) {
			System.out.println(a);
		}
		
		br.close();
	} //main

}
