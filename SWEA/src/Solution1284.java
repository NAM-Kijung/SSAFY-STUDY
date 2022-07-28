import java.util.Scanner;

public class Solution1284 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		for (int t = 0; t < tc; t++) {
			int P = sc.nextInt(); // A 1L당 요금
			int Q = sc.nextInt(); // B 기본 요금
			int R = sc.nextInt(); // B 기본 요금 기준 사용량
			int S = sc.nextInt(); // B 기준량 이상 사용했을 때 발생하는 1L당 요금
			int W = sc.nextInt(); // 실제 사용량

			int A = P * W;
			int B = (W <= R ? Q : Q + (S * (W - R)));

			if (A < B) {
				System.out.println("#" + (t+1) +" " + A);
			} else if (B < A) {
				System.out.println("#" + (t+1) + " " + B);
			}

		}
	}
}
