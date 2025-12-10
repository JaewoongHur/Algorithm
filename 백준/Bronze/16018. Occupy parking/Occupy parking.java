import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		char[] a = br.readLine().toCharArray();
		char[] b = br.readLine().toCharArray();
		
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			if(a[i]=='C' && b[i]=='C') {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
