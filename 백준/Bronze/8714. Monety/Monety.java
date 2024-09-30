import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a = 0;
		int b = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			
			int k = Integer.parseInt(st.nextToken());
			
			if(k == 1) {
				a++;
			}else {
				b++;
			}
		}
		System.out.println(Math.min(a, b));
	}
}