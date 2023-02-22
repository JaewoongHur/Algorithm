import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int k = 1;
		int min = Integer.MAX_VALUE;
		
		while(k<N) {
			int a = k;
			int S = k;
			while(a != 0 ) {
				S += a % 10;
				a = a / 10;
			}
			if(S == N) {
				min = Math.min(k, min);
			}
			k++;			
		}
		if(min== Integer.MAX_VALUE) {
			System.out.println(0);
		}
		else {
		System.out.println(min);
		}
	}
}