import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());

		double w = Double.parseDouble(st.nextToken());
		double h = Double.parseDouble(st.nextToken());
		
		double r = Double.parseDouble(br.readLine());

		double area = w * h - Math.PI*r*r/4;
		
		System.out.println(area);
		
	}
}
