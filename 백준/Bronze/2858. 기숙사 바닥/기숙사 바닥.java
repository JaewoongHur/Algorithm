import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		for(int i=1;i<=(int)Math.sqrt(b);i++) {
			if(b%i!=0) continue;
			
			if((i+2)*(b/i+2) == a+b) {
				System.out.println((b/i+2) + " " + (i+2));
				break;
			}
		}
	}
}