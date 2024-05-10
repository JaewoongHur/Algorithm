import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb  = new StringBuilder();
		
		String s;
		
		int tc = 1;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			
			
			int n = Integer.parseInt(s);
			
			sb.append("Case ").append(tc).append(":").append('\n');
			sb.append(n).append(" pencils for ").append(n).append(" cents").append('\n');
			
			boolean pass = true;
			
			for(int i=1;i<=n/4;i++) {
				for(int j=1;j<=n-i;j++) {
					for(int k=1;k<=n-i-j;k++) {
						if(i*16 + j*2 + k == 4*n && i+j+k == n) {
							sb.append(i).append(" at four cents each").append('\n');
							sb.append(j).append(" at two for a penny").append('\n');
							sb.append(k).append(" at four for a penny").append('\n');
							sb.append('\n');
							pass = false;
						}
					}					
				}
			}
			if(pass) {
				sb.append("No solution found.").append('\n').append('\n');
			}
			tc++;
		}
		
		System.out.println(sb);
		
	}
}