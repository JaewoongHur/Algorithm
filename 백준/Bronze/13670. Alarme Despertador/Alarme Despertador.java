import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0 0 0 0")) {
				break;
			}
			
			st = new StringTokenizer(s);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			int t = 0;
			int h = 0;
			
			if(c<a) {
				h = 24 + c - a;
				t = 60 * h + d - b;
			}else if(c == a){
				if(d<b) {
					h = 24 + c - a;
					t = 60 * h + d - b;
				}else {
					h = c - a;
					t = 60 * h + d - b;
				}
			}else {
				t = 60 * (c-a) + d - b;
			}
			
			System.out.println(t);
		}
	}
}
