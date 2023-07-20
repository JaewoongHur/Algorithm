import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int a = 1;
		int b = 1;
		int c = 1;
		
		int y = 1;
		while(!(a==E && b==S && c==M)) {
			y++; a++; b++; c++;
			if(a>15) {
				a=1;
			}
			if(b>28) {
				b=1;
			}
			if(c>19) {
				c=1;
			}
		}	
		System.out.println(y);
	}
}