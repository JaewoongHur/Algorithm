import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String s;
		for(int i=0;i<N;i++) {
			s=br.readLine();
			sb.append(s.toLowerCase()).append('\n');			
		}
		System.out.println(sb);
	}
}