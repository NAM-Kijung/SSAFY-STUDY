package day1;

import java.util.Scanner;

public class swea1204_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int tn = sc.nextInt();
			
			// �л����� ���� ī��Ʈ �迭 scores[]
			int[] scores = new int[101];
			
			int idx =0;
			for(int i=0; i<1000; i++) {
				idx = sc.nextInt();
				scores[idx]++;
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