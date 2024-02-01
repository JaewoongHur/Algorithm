import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());

		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		for(int i=0;i<r*a;i++) {
			for(int j=0;j<c*b;j++) {
				if(((j/b)%2==0 && (i/a)%2==0)||(((j/b)%2==1 && (i/a)%2==1))) {
					sb.append('X');
				}
				else {
					sb.append('.');
				}
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
		
	}
}