import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			if(i % 2 == 0) {
				if(s.charAt(i)!='I') {
					cnt++;
				}
			}else {
				if(s.charAt(i)!='O') {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
	}
}
