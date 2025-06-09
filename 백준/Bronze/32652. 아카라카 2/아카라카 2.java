import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s = "AKARAKA";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(s);
		
		for(int i=0;i<n-1;i++) {
			sb.append("RAKA");
		}
		
		System.out.println(sb);
		
	}
}