import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		boolean isCyclicPalindrome = false;

		out: for (int i = 0; i < s.length(); i++) {
			String a = s.substring(0, i);
			String b = s.substring(i, s.length());

			String ns = b + a;

			for (int j = 0; j < s.length() / 2; j++) {
				if (ns.charAt(j) != ns.charAt(s.length() - j - 1)) {
					continue out;
				}
			}
			
			isCyclicPalindrome = true;
			break;
		}
		
		if(isCyclicPalindrome) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}