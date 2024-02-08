import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<n;tc++) {
			
			int min = Integer.MAX_VALUE;
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<7;i++) {
				int a = Integer.parseInt(st.nextToken());
				if(a%2==0) {
					min = Math.min(min, a);
					sum += a;
				}
			}
			System.out.println(sum + " " + min);
		}
	}
}