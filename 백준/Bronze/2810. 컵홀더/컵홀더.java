import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String a = br.readLine();
		
		int l = 0;
		
		for(int i=0;i<n;i++) {
			if(a.charAt(i)=='L') {
				l++;
			}
		}
		
		int cupHolder = n+1-l/2;
		
		if(cupHolder>=n) {
			System.out.println(n);
		}else {
			System.out.println(cupHolder);
		}
		
	}
}