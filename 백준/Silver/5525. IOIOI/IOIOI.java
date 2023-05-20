import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		int ans = 0;
		
		boolean start = false;
		
		int cnt = 0;
		
		for(int i=0;i<M;i++) {
			if(!start && s.charAt(i)=='I') {
				start = true;
				continue;
			}
			
			if(start) {
				if(s.charAt(i-1)=='O' && s.charAt(i)=='I') {
					cnt++;
				}
				else if(s.charAt(i-1)=='I' && s.charAt(i)=='I') {
					if(cnt>=N) {
						ans += cnt-N+1;
						
					}
					cnt = 0;
				}
				else if(s.charAt(i-1)=='O' && s.charAt(i)=='O') {
					start = false;
					if(cnt>=N) {
						ans += cnt-N+1;
						
					}
					cnt = 0;
				}
			}

			if(i==M-1 && start) {
				if(cnt>=N) {
					ans += cnt - N+1;
				}
			}
			
		}
		System.out.println(ans);
	
	}
}