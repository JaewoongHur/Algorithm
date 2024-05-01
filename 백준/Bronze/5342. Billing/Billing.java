import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		
		double a = 0;
		
		while (true) {

			s = br.readLine();

			if (s.equals("EOI")) {
				break;
			}

			if (s.equals("Paper")) {
				a += 57.99;
			} else if (s.equals("Printer")) {
				a += 120.50;
			} else if (s.equals("Planners")) {
				a += 31.25;
			} else if (s.equals("Binders")) {
				a += 22.50;
			} else if (s.equals("Calendar")) {
				a += 10.95;
			} else if (s.equals("Notebooks")) {
				a += 11.20;
			} else if (s.equals("Ink")) {
				a += 66.95;
			}
		}
		System.out.printf("$%.2f", a);
	}
}