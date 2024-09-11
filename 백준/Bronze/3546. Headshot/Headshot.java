import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;

		s = br.readLine();

		double shoot = 0.0d;
		double rotate = 0.0d;

		double zero = 0;
		double one = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '0') {
				if (s.charAt(i + 1) == '0') {
					zero++;
				} else {
					one++;
				}
			}
		}

		if (s.charAt(s.length() - 1) == '0') {
			if (s.charAt(0) == '0') {
				zero++;
			} else {
				one++;
			}
		}

		shoot = zero / (zero + one);

		zero = 0;
		one = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				zero++;
			} else {
				one++;
			}
		}

		rotate = zero / (zero + one);
		
		if(shoot > rotate) {
			System.out.println("SHOOT");
		}else if(shoot == rotate) {
			System.out.println("EQUAL");
		}else {
			System.out.println("ROTATE");
		}
	}
}