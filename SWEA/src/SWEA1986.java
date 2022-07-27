import java.util.Scanner;

public class SWEA1986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// test case 입력
		int tc = sc.nextInt();
		int N = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			int sum = 0;
			for (int j = 1; j <= N; j++) {
				if (j % 2 == 0) {
				sum = sum - j;
				} else {
				sum = sum + j;
				}
			}
			System.out.println("#" + (i + 1) + " " + sum);
		}
	}
}
