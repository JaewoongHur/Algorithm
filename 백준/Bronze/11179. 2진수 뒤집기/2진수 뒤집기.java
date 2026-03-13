import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		String s = Integer.toBinaryString(n);
		
		int m = 0;
		for(int i=0;i<s.length();i++) {
			m += (s.charAt(i)-'0')*Math.pow(2, i);
		}
		
		System.out.println(m);
	}
}
