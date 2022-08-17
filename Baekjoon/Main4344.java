import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {

			// �迭�����
			StringTokenizer st = new StringTokenizer(br.readLine());
			List<Integer> arr = new ArrayList<>();

			while (st.hasMoreTokens()) {
				int tmp = Integer.parseInt(st.nextToken());
				arr.add(tmp);
			}
			// ù��°�� �����ϰ� �� ���ϱ�
			int sum = 0;
			for (int j = 1; j < arr.size(); j++) {
				sum += arr.get(j);
			}
			// ù��° �迭 ���ڷ� ������
			double ave = (double) sum / arr.get(0);
			//����� �Ѵ� �л��� ��
			int cnt =0;
			for (int j = 1; j < arr.size(); j++) {
				if (arr.get(j) > ave) {
					cnt++;
				}
			}
			double ratio = (double) cnt/arr.get(0)*100;
			double ans = Math.round(ratio*1000)/1000.0;
			System.out.printf("%.3f", ans);
			System.out.println("%");
		}

	}
}
