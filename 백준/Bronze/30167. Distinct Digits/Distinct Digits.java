import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int l = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		int ans = -1;
		
		out: for(int i=l;i<=r;i++) {
			int[] digit = new int[10];
			
			String s = String.valueOf(i);
			
			for(int j=0;j<s.length();j++) {
				digit[s.charAt(j)-'0']++;
			}
			
			for(int j=0;j<10;j++) {
				if(digit[j]>1) {
					continue out;
				}
			}
			
			ans = i;
			break;
		}
		
		System.out.println(ans);
	
	}
}
