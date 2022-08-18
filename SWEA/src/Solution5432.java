import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class Solution5432 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		//테스트 케이스만큼 반복
		for(int t = 1; t <= T; t++) {
			Stack<Character> stack = new Stack<>();
			int stacksize = 0;
			
			//괄호 입력받아서 배열로 만들기
			String bracket = br.readLine();
			char[] split = bracket.toCharArray();
			
			int sum = 0; //쇠막대의 개수
			for (int i = 0; i < split.length; i++) {
				//만약 레이저면 스텍에 있는 수만큼 ++
				if (split[i] == '(' && split[i+1] == ')') {
					sum+=stacksize;
					i++;
				} 
				//만약 왼쪽 괄호이면 스텍에 넣기
				else if (split[i] == '(') {
					stack.push(split[i]);
					stacksize++;
				}
				//만약 오른쪽 괄호이면 1씩 더하기
				else {
					stack.pop();
					stacksize--;
					sum+=1;
				}
			}
			bw.write("#" + t + " " + sum);
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
