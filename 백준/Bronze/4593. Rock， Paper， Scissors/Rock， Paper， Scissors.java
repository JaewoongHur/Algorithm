import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String a;
		String b;

		while (true) {

			a = br.readLine();
			b = br.readLine();

			if (a.equals("E") && b.equals("E")) {
				break;
			}
			
			int n = a.length();
			
			int x = 0;
			int y = 0;
			
			for(int i=0;i<n;i++) {
				if(a.charAt(i)=='R') {
					if(b.charAt(i)=='S') {
						x++;
					}else if(b.charAt(i)=='P') {
						y++;
					}					
				}else if(a.charAt(i)=='S') {
					if(b.charAt(i)=='R') {
						y++;
					}else if(b.charAt(i)=='P') {
						x++;
					}	
				}else {
					if(b.charAt(i)=='S') {
						y++;
					}else if(b.charAt(i)=='R') {
						x++;
					}	
				}
			}
			sb.append("P1: ").append(x).append('\n');
			sb.append("P2: ").append(y).append('\n');
		}

		System.out.println(sb);
	}
}