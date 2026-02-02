import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(n);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			sb.append(1).append(' ');
		}
		
		System.out.println(sb);
	
	}
}
