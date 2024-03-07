import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		if(n == 0) {
			sb.append('1');
		}else if(n==1) {
			sb.append('0');
		}else {
			if(n%2==1) {
				sb.append('4');
				
				int a = n/2;

				for(int i=0;i<a;i++) {
					sb.append('8');
				}
			}else {
				int a = n/2;
				for(int i=0;i<a;i++) {
					sb.append('8');
				}
			}
		}
		System.out.println(sb.toString());
	}
}