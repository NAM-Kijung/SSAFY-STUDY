import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution8931 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			int sum = 0;
			int size = 0;

			// ���� ���� 0�̸� �ȿ� �ִ� ���� ���� �ƴϸ� �ֱ�
			Stack<Integer> stack = new Stack<>();

			int t = Integer.parseInt(br.readLine());

			for (int j = 0; j < t; j++) {

				int x = Integer.parseInt(br.readLine());

				if (x > 0) {
					stack.push(x);
					size++;
				} else {
					stack.pop();
					size--;
				}
			}
			if (size != 0) {
				for (int z = 0; z < size; z++) {
					sum += stack.get(z);
				}
			}
			System.out.println("#" + i + " " + sum);
		}
	}
}
