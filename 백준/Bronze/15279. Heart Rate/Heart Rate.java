import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			double b = Double.parseDouble(st.nextToken());
			double p = Double.parseDouble(st.nextToken());
			
			System.out.println(60*(b-1)/p + " " + 60*b/p + " " + 60*(b+1)/p);
			
		}
	}
}
