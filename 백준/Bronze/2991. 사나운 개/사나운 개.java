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
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int ap = 0;
		int am = 0;
		int an = 0;
		
		if(p%(a+b)>=1 && p%(a+b)<=a) {
			ap++;
		}
		if(p%(c+d)>=1 && p%(c+d)<=c) {
			ap++;
		}
		if(m%(a+b)>=1 && m%(a+b)<=a) {
			am++;
		}
		if(m%(c+d)>=1 && m%(c+d)<=c) {
			am++;
		}
		if(n%(a+b)>=1 && n%(a+b)<=a) {
			an++;
		}
		if(n%(c+d)>=1 && n%(c+d)<=c) {
			an++;
		}
		System.out.println(ap);
		System.out.println(am);
		System.out.println(an);
	}
}