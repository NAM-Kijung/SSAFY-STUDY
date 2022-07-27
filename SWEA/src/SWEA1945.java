import java.util.Scanner;

public class SWEA1945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] factor = { 2, 3, 5, 7, 11 };
		// 테스트 케이스 숫자
		int tc = sc.nextInt();

		// 테스트 케이스 만큼 반복
		for (int i = 0; i < tc; i++) {
			//나눌 값을 받음
			int N = sc.nextInt();
			// 다섯개의 a,b,c,d,e 값을 담을 배열을 생성
			int[] number = new int[5];
			
			// abcde로 나눠지는 횟수 각각 구하기
			for (int j = 0; j < 5; j++) {
				int num = 0;
				while (N % factor[j] == 0) {
					int div = N / factor[j];
					N = div;
					num++;
				}
				//구한 나눠지는 횟수 number 배열에 넣기
				number[j] = num;
			}
			System.out.println("#" + (i+1) + " " + number[0] + " " + number[1] + " " + number[2] + " " + number[3]
					+ " " + number[4]);
		}
	}
}
