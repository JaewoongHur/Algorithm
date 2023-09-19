import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int score = 0;
		int idx = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(st.nextToken());
			if(a==0) {
				idx = 0;
			}
			else {
				score += ++idx;
			}
		}
		System.out.println(score);
	}
}