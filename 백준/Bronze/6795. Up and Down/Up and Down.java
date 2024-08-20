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
		int s = Integer.parseInt(br.readLine());

		int x = 0;
		int y = 0;

		int k = 0;

		boolean f = true;

		while (true) {
			if (f) {
				if (k + a >= s) {
					x += s - k;
					break;
				} else {
					k += a;
					x += a;
				}
			} else {
				if (k + b >= s) {
					x -= s - k;
					break;
				} else {
					k += b;
					x -= b;
				}
			}

			f = !f;
		}

		k = 0;

		f = true;

		while (true) {
			if (f) {
				if (k + c >= s) {
					y += s - k;
					break;
				} else {
					k += c;
					y += c;
				}
			} else {
				if (k + d >= s) {
					y -= s - k;
					break;
				} else {
					k += d;
					y -= d;
				}
			}

			f = !f;
		}
		
		if(x > y) {
			System.out.println("Nikky");
		}else if(x == y) {
			System.out.println("Tied");
		}else {
			System.out.println("Byron");
		}
	}
}