import java.util.Scanner;

public class solution1959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int arr1[] = new int[N];
			int arr2[] = new int[M];
			// N개의 int를 가진 배열
			for (int n = 0; n < N; n++) {
				arr1[n] = sc.nextInt();
			}
			// M개의 int를 가진 배열
			for (int m = 0; m < M; m++) {
				arr2[m] = sc.nextInt();
			}

			int max = 0;
			// M과 N의 갯수 차이만큼 for문 반목
			for (int i = 0; i <= Math.abs(M - N); i++) {
				int sum = 0;
				int z = i;
				int tmp = 0;
					//M이 더 클경우
					if (M > N) {
						for (int j = 0; j < N; j++) {
						tmp = arr1[j] * arr2[z];
						z++;
						sum += tmp;
						}
					}
					//N이 더 클경우
					else if (N > M) {
						for (int j =0; j < M; j++) {
						tmp = arr1[z] * arr2[j];
						z++;
						sum += tmp;
					}					
				}
				if (max < sum)
					max = sum;
			}
			System.out.println("#" + t + " " + max);
		}
	}
}
