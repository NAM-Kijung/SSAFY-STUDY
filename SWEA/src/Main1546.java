import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		// ���� ū �� ���ϱ�, �迭�� �� �����ϱ�
		int max = 0;
		int[] arr = new int[t];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

			if (arr[i] > max)
				max = arr[i];
		}
		// /max*100�ؼ� ��հ��� ������
		double sum = 0; //������ ���� �ջ��� ��
		for ( int i = 0 ; i < t; i++) {
			double a = (double)arr[i]/max*100;
			sum+=a;
		}
		
		double ans = (double)sum/t;
		System.out.println(ans);
		br.close();
	}
}
