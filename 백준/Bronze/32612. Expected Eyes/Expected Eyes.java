import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		double exp = 0;
		
		for(int i=0;i<n;i++) {
			double a = Double.parseDouble(st.nextToken());
			exp += (1+a)/2;
		}
		
		System.out.println(exp);
		
	}
}
