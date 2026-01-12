import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		String a = br.readLine();
		String b = br.readLine();
		
		for(int i=0;i<n;i++) {
			if(a.charAt(i)=='R') {
				if(b.charAt(i)=='S') {
					sb.append('R');
				}else{
					sb.append('P');
				}
			}else if(a.charAt(i)=='S') {
				if(b.charAt(i)=='P') {
					sb.append('S');
				}else {
					sb.append('R');
				}
			}else {
				if(b.charAt(i)=='R') {
					sb.append('P');
				}else {
					sb.append('S');
				}
			}
		}
		System.out.println(sb);
	}
}
