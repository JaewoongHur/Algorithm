import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String s;
		while (true) {
			s = br.readLine();
			if (s.equals("#")) {
				break;
			}

			int a = 0;
			int p = 0;
			int y = 0;
			int n = 0;
			
			for(int i=0;i<s.length();i++) {
				switch(s.charAt(i)) {
					case 'Y':
						y++;
						break;
					case 'P':
						p++;
						break;
					case 'N':
						n++;
						break;
					default :
						a++;
						break;
				
				}
			}
			
			if(s.length()<=2*a) {
				sb.append("need quorum").append('\n');
			}else if(y>n) {
				sb.append("yes").append('\n');
			}else if(y<n) {
				sb.append("no").append('\n');
			}else {
				sb.append("tie").append('\n');
			}
			
		}
		System.out.println(sb);
	}
}