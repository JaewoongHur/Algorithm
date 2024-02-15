import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] x = new char[] {'A','B','C'};
		char[] y = new char[] {'B','A','B','C'};
		char[] z = new char[] {'C','C','A','A','B','B'};
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		int a = 0; int b = 0; int c = 0;
		
		
		for(int i=0;i<n;i++) {
			char k = s.charAt(i);
			
			if(x[i%3] == k) {
				a++;
			}
			
			if(y[i%4] == k) {
				b++;
			}
			
			if(z[i%6] == k) {
				c++;
			}
		}
		
		if(a==b && b == c) {
			System.out.println(a);
			System.out.println("Adrian");
			System.out.println("Bruno");
			System.out.println("Goran");
		}else if(a==b && b>c) {
			System.out.println(a);
			System.out.println("Adrian");
			System.out.println("Bruno");
		}else if(b==c && c>a) {
			System.out.println(b);
			System.out.println("Bruno");
			System.out.println("Goran");
		}else if(c==a && a> b) {
			System.out.println(a);
			System.out.println("Adrian");
			System.out.println("Goran");
		}else if(a>b && a>c) {
			System.out.println(a);
			System.out.println("Adrian");
		}else if(b>a && b>c) {
			System.out.println(b);
			System.out.println("Bruno");
		}else if(c>a && c>b) {
			System.out.println(c);
			System.out.println("Goran");
		}
		
	}
}