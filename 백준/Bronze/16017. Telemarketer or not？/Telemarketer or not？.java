import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());

		boolean pass = true;

		if (a != 8 && a != 9) {
			pass = false;
		}

		if (b != c) {
			pass = false;
		}

		if (d != 8 && d != 9) {
			pass = false;
		}
		
		if(pass) {
			System.out.println("ignore");
		}else {
			System.out.println("answer");
		}
	}
}