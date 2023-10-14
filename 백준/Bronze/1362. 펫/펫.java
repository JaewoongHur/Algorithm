import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String s;
		int o = 0;
		int w = 0;
		int idx= 0;
		
		while(true) {
			s = br.readLine();
			if(s.equals("0 0")) {
				break;
			}
			
			idx++;
			st = new StringTokenizer(s);
			o = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			
			boolean live = true;
			
			while(true) {
				s = br.readLine();
				
				if(s.equals("# 0")) {
					if(!live) {
						sb.append(idx).append(" RIP").append('\n');
						break;
					}
					if(w>o/2 && w<2*o) {
						sb.append(idx).append(' ').append(":-)").append('\n');
					}
					else {
						sb.append(idx).append(' ').append(":-(").append('\n');
					}
					
					break;
				}
				
				st = new StringTokenizer(s);
				String a = st.nextToken();
				int n = Integer.parseInt(st.nextToken());
				
				if(a.equals("E")){
					w-=n;
					if(w<=0) {
						live =false;
					}
				}
				else if(a.equals("F")) {
					w+=n;
				}
				
			}
		}
		System.out.println(sb);
	}
}