package day1;

import java.util.Scanner;

//��ü �󵵼��� �˸� �ش簪�� ����� �� �� �ִ�
// > �߰���, n��° ���� �� �� ����
public class swea2063 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] cnt = new int[101];
		for(int i=0; i<N; i++) {
			int t = sc.nextInt();
			cnt[t]++;
		}
		
		int sum = 0;
//		int mid = (N+1)/2;
//		for (int i=0; i<cnt.length; i++) {
//			sum += cnt[i];
//			if(sum >= mid) {
//				System.out.println(i);
//				break;
//			}
//		}
		
		int mid = (N)/2;
		for (int i=0; i<cnt.length; i++) {
			sum += cnt[i];
			if(sum > mid) {
				System.out.println(i);
				break;
			}
		}
		
	} //main
}//end class