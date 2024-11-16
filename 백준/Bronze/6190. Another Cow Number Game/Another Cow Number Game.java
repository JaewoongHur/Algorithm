import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		long a = n;
		
		int score = 0;
		
		while(a!=1) {
			if(a % 2 == 1) {
				a = 3*a+1;
			}else {
				a/=2;
			}
			score++;
		}
		System.out.println(score);
	}
}