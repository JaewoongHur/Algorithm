import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		double[] val = new double[n];

		String s = br.readLine();

		for (int i = 0; i < n; i++) {
			val[i] = Double.parseDouble(br.readLine());
		}

		Stack<Double> stack = new Stack<>();

		double b = 0;
		double c = 0;

		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);

			if (Character.isAlphabetic(a)) {
				stack.add(val[a - 'A']);
			} else {
				c = stack.pop();
				b = stack.pop();
				
				if (a == '*') {
					stack.add(b*c);
				} else if (a == '+') {
					stack.add(b+c);
				} else if (a == '/') {
					stack.add(b/c);
				} else if (a == '-') {
					stack.add(b-c);
				}
			}
		}
		
		System.out.printf("%.2f",stack.pop());
		
	}
}