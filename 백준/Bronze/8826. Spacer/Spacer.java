import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine().trim());
		
		for(int tc=0;tc<T;tc++) {
			int n = Integer.parseInt(br.readLine().trim());
			
			String s = br.readLine();
			
			int x = 0; int y = 0;
			
			for(int i=0;i<n;i++) {
				if(s.charAt(i)=='E') {
					x++;
				}else if(s.charAt(i)=='W') {
					x--;
				}else if(s.charAt(i)=='N') {
					y++;
				}else {
					y--;
				}
			}
			System.out.println(Math.abs(x) + Math.abs(y));
		}
	}
}