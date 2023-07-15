import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s = br.readLine();
		String res = "";
		int n = s.length();
		boolean t = true;
		String ns;
		for(int i=1;i<n-1;i++) {
			StringBuilder sb1 = new StringBuilder();
			sb1.append(s.substring(0,i)).reverse();
			for(int j=i+1;j<n;j++) {
				StringBuilder sb = new StringBuilder();
				StringBuilder sb2 = new StringBuilder();
				StringBuilder sb3 = new StringBuilder();
				sb2.append(s.substring(i,j)).reverse();
				sb3.append(s.substring(j,n)).reverse();
				sb = sb.append(sb1).append(sb2).append(sb3);
				ns = sb.toString();
				if(t) {
					res = ns;
					t = false;
				}
				if(res.compareTo(ns)>0) {
					res = ns;
				}
			}			
		}
		
		System.out.println(res);
	}	
}