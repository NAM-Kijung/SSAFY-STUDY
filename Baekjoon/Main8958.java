import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i<t; i++) {
			
			String oxox = br.readLine();
			//���� ���ڿ��� chararray�� �ٲٱ�
			char[] sp = oxox.toCharArray();
			
			//ox���� �Ǻ��ϱ� �迭 ���̸�ŭ ������
			int a = 0;
			int o = 0;//���� ������ ����
			int ans = 0; //�ջ� ���� ����
			while(sp.length>a) {
				if(sp[a] == 'O') {
					o+=1;
					ans+=o;
				} else {
					o = 0;
				}
				a++;
			}
			System.out.println(ans);
			}
	}
}
