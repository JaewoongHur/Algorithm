import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine().trim());
		
		int[] player = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		int max = 0;
		
		for(int i=0;i<n;i++) {
			player[i] = Integer.parseInt(st.nextToken());
			
			if(player[i]>max) {
				max = player[i];
			}
		}
		
		for(int i=0;i<n;i++) {
			if(player[i] == max) {
				sb.append((char)(i+'A'));
			}
		}
		System.out.println(sb);
	}
}