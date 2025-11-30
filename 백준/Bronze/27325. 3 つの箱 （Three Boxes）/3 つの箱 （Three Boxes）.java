import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		int idx = 1;
		
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='L') {
				if(idx != 1) {
					idx--;
				}
			}else {
				if(idx != 3) {
					idx++;
				}
			}
			
			if(idx == 3) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
