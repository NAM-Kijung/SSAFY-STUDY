import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SWEA1288 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for (int t = 0; t < tc; t++) {
			int N = sc.nextInt();
			Set<Integer> set = new HashSet<>();
			
			int n = 0;
			int m = 0;
			while(set.size() != 10) {
				int mult = N * (n = n+1);
				m = mult;
				
				//자릿수 구하기	
				while (mult >= 1) {
					int d = mult % 10;
					mult = mult/10;
					//자릿수를 set에 넣기
					set.add(d);
				}
			}
			System.out.println("#"+(t+1)+" "+m);
		}
	}
}
