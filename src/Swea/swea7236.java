package Swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea7236 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int t=1; t<=T; t++) {
			int N = Integer.parseInt(br.readLine());
			String[][] arr = new String[N+2][N+2];
			
			for(int i=1; i<N+1; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=1; j<N+1; j++) {
					arr[i][j] = st.nextToken();
				}
			}
				
			
			int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
			int[] dc = {0, 0, -1, 1, -1, 1, 1, -1};
			
			int max =0;
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					int cnt =0;
					if(arr[i][j].equals("W")) {
						for(int q=0; q<8; q++) {
							if(i+dr[q]>=0 && i+dr[q]<N+2 && i+dc[q]>=0 && i+dc[q]<N+2 && arr[i+dr[q]][j+dc[q]] != null && arr[i+dr[q]][j+dc[q]].equals("W")) {
								cnt++;
							} else {
 								continue;
 							}
						}
						
						if(cnt==0) {
							cnt=1;
						}
					}
					max = Math.max(max, cnt);
				}
			}
			
			System.out.println("#"+t+" "+max);
			
		}
		
	} //main

}
