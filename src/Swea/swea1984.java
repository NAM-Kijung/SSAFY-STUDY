package day1;

import java.util.Scanner;

public class swea1984 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[10];
		
		for(int t=1; t<=T; t++) {
			
			//�迭�� �� ����
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			// �迭 �����ϱ�
//			1. ��������
//			int tmp=0;
//			for(int i =0; i<arr.length-1; i++) {
//				for(int j=0; j<arr.length-1-i; j++) {
//					if(arr[j] > arr[j+1]) {
//						tmp = arr[j];
//						arr[j] = arr[j+1];
//						arr[j+1] = tmp;
//					}
//				}
//			} //for
			
//			2. ���� ���ķ� Ǯ���
//			for() {
//				
//			}
			
			
			
			
			//������ ��հ� ���ϱ�
			int sum = 0;
			for(int i=1; i<arr.length-1; i++) {
				sum += arr[i];
			}
			
			double result = (double)sum/(arr.length-2);
			System.out.println("#"+t+" "+Math.round(result));
		} //for: T�� �ݺ�
		
		
	} //main
} //end class

// ����
// �� �յ� ���� �������� ��հ� ���ϱ�
