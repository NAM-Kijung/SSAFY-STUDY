package day1;

import java.util.Scanner;

public class swea1204_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int tn = sc.nextInt();
			// �Է� ���� �л��� ���� �迭 arg[]
			int[] arg = new int[1000];
			// �л����� ���� ī��Ʈ �迭 scores[]
			int[] scores = new int[101];
			
			// ���� �Է� �޾� �����ϰ�
			// scores[] �迭�� ī��Ʈ
			for(int j=0; j<arg.length; j++) {
				arg[j] = sc.nextInt();
				scores[arg[j]]++;
			}
			
			// scores[] �迭���� �ִ밪 ã��
			// �� �ִ밪�� �ε����� ����
			int max = 0;
			int result = 0;
			for(int j=0; j<scores.length; j++) {
				if(max<=scores[j]) {
					max = scores[j];
					if(result<=j) {
						result = j;
					}
				}
			}

			System.out.println("#"+tn+" "+result);
		}
		
	} //main
}//end class






// �� ������ arg[]�� �Է� �޴´�
// arg[]�� ���� scores �ε����� ��, scores[arg[]]++;
// scores �� ���� ���� ū �� ã��