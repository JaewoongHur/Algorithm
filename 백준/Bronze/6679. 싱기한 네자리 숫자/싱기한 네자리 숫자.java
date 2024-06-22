import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		for (int i = 1000; i <= 9999; i++) {
			int a = 0;
			int t = i;
			for (int j = 0; j < 4; j++) {
				a += t % 10;
				t /= 10;
			}
			
			t = i;
			int b = 0;
			while (t > 0) {
				b+=t % 12;
				t /= 12;
			}
			if(a != b) {
				continue;
			}
			int c = 0;
			t = i;
			while (t > 0) {
				c+=t % 16;
				t /= 16;
			}
			
			if(a!=c) {
				continue;
			}
			
			System.out.println(i);
		}

	}
}