import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		double n = Double.parseDouble(st.nextToken());
		double p = Double.parseDouble(st.nextToken());
		
		System.out.println(n*p*0.055);
	}
}
