import java.util.Scanner;

public class Solution1989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		
		for(int t = 1; t <= tc; t++) {
			boolean check = true;
			String str = sc.next();
			
			for(int i = 0; i < str.length()/2;i++) {
				//str 문자열에 있는 idx i 문자를 char로 바꿔준다.
					char c = str.charAt(i);
				if (c != str.charAt(str.length()-i-1)) {
					check = false;
				} else {
					check = true;
				}
			}System.out.print("#"+ t);
			if (check) {
				System.out.println(" "+1);
			} else if (!check) {
				System.out.println(" "+0);
			}
		}
	}
}
