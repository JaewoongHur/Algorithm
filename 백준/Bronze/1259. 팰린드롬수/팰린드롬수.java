import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String s = sc.next();
			if (Integer.parseInt(s) == 0) {
				break;
			}
			System.out.println(isPalindrome(s, 0, s.length() - 1));
		}
		sc.close();
	}

	static String isPalindrome(String s, int left, int right) {

		if (left >= right) {
			return "yes";
		} else {
			if (s.charAt(left) == s.charAt(right)) {
				return isPalindrome(s, left + 1, right - 1);
			} else {
				return "no";
			}
		}
	}
}