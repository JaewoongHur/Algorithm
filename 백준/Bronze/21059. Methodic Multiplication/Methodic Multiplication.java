import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String b = br.readLine();
		
		int x = 0;
		int y = 0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='S') {
				x++;
			}
		}
		
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)=='S') {
				y++;
			}
		}
		
		int p = x * y;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<p;i++) {
			sb.append("S(");
		}
		
		sb.append("0");
		
		for(int i=0;i<p;i++) {
			sb.append(")");
		}
		
		System.out.println(sb);
	}
}