import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int r = 0;
		int a = 0;
		int t = 0;
		int k = 0;
		int s = 0;
		
		String code = br.readLine();
		int idx = 0;
		
		for(int i=0;i<n;i++) {
			if(code.charAt(i)=='R') {
				r++;
			}else if(code.charAt(i)=='A') {
				a++;
			}else if(code.charAt(i)=='T') {
				t++;
			}else if(code.charAt(i)=='K') {
				k++;
			}else if(code.charAt(i)=='S') {
				s++;
			}
			
			if(r>=1&&a>=2&&t>=1&&k>=1&s>=1) {
				idx = i+1;
				break;
			}
		}
		
		System.out.println(idx);
	}
}
