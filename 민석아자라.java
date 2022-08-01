import java.util.HashSet;
import java.util.Scanner;

public class 민석아자라 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테케횟수입력받기
		int cnt = 0; // 곱하기인자

		for (int i = 1; i <= T; i++) { // 테케 1~T까지 실행
			HashSet<Integer> set = new HashSet<Integer>(); // 중복없는 해쉬셋이용
			int N = sc.nextInt(); // N입력받기
			int sheep = 0;
			int num = 0;
			cnt = 0;
			while (set.size() != 10) {
				cnt++;
				sheep = N * cnt;
				do {
					num = sheep % 10;
					set.add(num);
					num = sheep / 10;
					sheep = num;
				} while (num != 0);
			}
			sheep = N * cnt;
			System.out.printf("#%d %d\n", i, sheep);
		}
		sc.close();
	}

}
