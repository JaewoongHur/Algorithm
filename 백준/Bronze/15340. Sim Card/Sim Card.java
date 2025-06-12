import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a;

		while (true) {
			a = br.readLine();
			if (a.equals("0 0")) {
				break;
			}

			String[] s = a.split(" ");
			int c = Integer.parseInt(s[0]);
			int d = Integer.parseInt(s[1]);
			
			int min = Integer.MAX_VALUE;
			
			min = Math.min(30*c + 40*d, min);
			min = Math.min(35*c + 30*d, min);
			min = Math.min(40*c + 20*d, min);
			
			System.out.println(min);
		}
	}
}