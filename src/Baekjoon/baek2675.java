package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2675 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			char[] cc = new char[S.length()];
			for(int j=0; j<S.length(); j++) {
				cc[j] = S.charAt(j);
				for(int r=0; r<R; r++) {
					System.out.print(cc[j]);
				}
			}
			System.out.println();
		}
		
	} //main

}
