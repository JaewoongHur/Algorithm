import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split("\\+");

		String a = s[0];
		double b = Double.parseDouble(s[1]);

		String[] s2 = a.split("d");

		double c = Double.parseDouble(s2[0]);
		double d = Double.parseDouble(s2[1]);

		double min = c + b;
		double max = c * d + b;

		double avg = (min + max) / 2;
		
		if (avg == (int) avg) {
			System.out.println((int) avg);
		} else {
			System.out.println(avg);
		}
	}
}