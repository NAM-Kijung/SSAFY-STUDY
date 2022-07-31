import java.util.Scanner;

public class Solution1979 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt(); // 테스트 케이스 개수

		for (int t = 1; t <= tc; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] arr = new int[N][N];
			int num = 0;// K가 들어갈 수 있는 자리의 개수

			// 2차원 배열 만들기
			for (int I = 0; I < N; I++) {
				for (int i = 0; i < N; i++) {
					arr[I][i] = sc.nextInt();
				}
			}

			// 1이 연속으로 K번 있는 횟수 구하기
			for (int J = 0; J < N; J++) {
				int cnt = 0;
				int cnt2 = 0;
				for (int j = 0; j < N; j++) {

					// 가로
					if (arr[J][j] == 1) {
						cnt++;
						// 1이 k번 나오고 마지막으로 1이 나온 자리가 배열의 수보다 작아을 때 다음에 오는 숫자가 0이거나 배열의 수보다 크면
						if (cnt == K && ((j + 1 <= N - 1 && arr[J][j + 1] == 0) || j + 1 > N - 1)) {
							num++;
							cnt = 0;
						}
					} else if (arr[J][j] == 0) {
						cnt = 0;
					}
					// 세로
					if (arr[j][J] == 1) {
						cnt2++;
						// 1이 k번 나오고 마지막으로 1이 나온 자리가 배열의 수보다 작아을 때 다음에 오는 숫자가 0이거나 배열의 수보다 크면
						if (cnt2 == K && ((j + 1 <= N - 1 && arr[j + 1][J] == 0) || j + 1 > N - 1)) {
							num++;
							cnt2 = 0;
						} 
					} else if (arr[j][J] == 0) {
						cnt2 = 0;
					}

				}
			}
			System.out.println("#" + t + " " + num);
		}
	}
}
