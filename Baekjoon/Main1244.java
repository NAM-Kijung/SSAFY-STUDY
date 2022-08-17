import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1244 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ó�� ����ġ�� ����
		int N = Integer.parseInt(br.readLine());

		// ����ġ ������ŭ ���� �޾Ƽ� �迭�� �����.
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// �л� ���� �޴´�.
		int student = Integer.parseInt(br.readLine());

		// �л� �� ��ŭ ������ ���� �޴´�.
		for (int i = 0; i < student; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int sex = Integer.parseInt(s.nextToken());
			int number = Integer.parseInt(s.nextToken());

			// ���� �����̸� �� ���� ����� �ٲ۴�.
			if (sex == 1) {
				for (int j = 0; j < N; j++) {
					if ((j + 1) % number == 0) {
						if (arr[j] == 1) {
							arr[j] = 0;
						} else {
							arr[j] = 1;
						}
					}
				}
			}
			// ���� �����̸� ������ ��Ī�� ��ŭ ���¸� �ٲٰ�
			int r = 0; // ���� ���ڿ� ���� for�� �ݺ� ����
			if (sex == 2) {
				if (number > N/2) {
					r = N - number;
				} else {
					r = number-1;
				}

				for (int j = 0; j <= r; j++) {
					if (arr[number - 1 - j] == arr[number - 1 + j]) {
						if (arr[number - 1 - j] == 1) {
							arr[number - 1 - j] = 0;
							arr[number - 1 + j] = 0;
						} else {
							arr[number - 1 - j] = 1;
							arr[number - 1 + j] = 1;
						}
					} else {
						break;
					}
				}
			}
		}
		// ���� ����ġ�� 20 ����̸� �Ʒ��ٿ� ����Ѵ�.
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
			cnt++;

			if (cnt % 20 == 0) {
				System.out.println();
			}
		}
	}
}
