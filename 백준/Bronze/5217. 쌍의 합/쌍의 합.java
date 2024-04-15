import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
			
		int n = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<n;tc++) {
			int k = Integer.parseInt(br.readLine());
			
			if(k==1) {
				sb.append("Pairs for 1:").append('\n');
				continue;
			}
			
			if(k==2) {
				sb.append("Pairs for 2:").append('\n');
				continue;
			}
			
			sb.append("Pairs for ").append(k).append(": ").append(1).append(" ").append(k-1);
			
			for(int i=2;i<(k+1)/2;i++) {
				sb.append(", ").append(i).append(' ').append(k-i);				
			}
			sb.append('\n');			
		}
		System.out.println(sb);
	}
}