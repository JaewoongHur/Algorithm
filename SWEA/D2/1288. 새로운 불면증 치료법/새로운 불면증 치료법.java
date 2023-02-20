import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			Set<Character> numSet = new HashSet<>();
			String s = br.readLine();
			int k = 1;
			int newNum = 0;
			while (numSet.size() < 10) {
				newNum = k * Integer.parseInt(s);
				String ns = Integer.toString(newNum);
				for (int j = 0; j < ns.length(); j++) {
					numSet.add(ns.charAt(j));
				}
				k++;
			}
			System.out.println("#" + i + " " + newNum);
		}
	}
}
