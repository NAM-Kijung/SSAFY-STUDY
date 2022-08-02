
import java.util.Scanner;

public class Solution2007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {
			String string = sc.next();

			for (int i = 1; i <= string.length(); i++) {
				String a = string.substring(0, i);
				String b = string.substring(i, i+i);
				if (a.equals(b)) {
					System.out.println("#" + t + " " + i);
					break;
				}
			}
		}
	}
}
