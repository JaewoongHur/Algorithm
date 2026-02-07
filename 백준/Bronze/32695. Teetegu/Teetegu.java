import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		double c = Double.parseDouble(st.nextToken());
		double d = Double.parseDouble(st.nextToken());
		
		System.out.println(c * 60);
		
		double x = 100 - 60 / (1/d + b/60);
		
		if(x<22) {
			x = 22;
		}
		
		System.out.println((100-x)*a);
		
	}
}
