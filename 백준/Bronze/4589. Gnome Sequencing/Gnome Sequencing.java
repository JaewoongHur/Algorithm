import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		sb.append("Gnomes:").append('\n');
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a>b && b>c) {
				sb.append("Ordered").append('\n');
			}
			else if(a<b && b<c) {
				sb.append("Ordered").append('\n');
			}
			else {
				sb.append("Unordered").append('\n');
			}
		}
		System.out.println(sb);
	}
}