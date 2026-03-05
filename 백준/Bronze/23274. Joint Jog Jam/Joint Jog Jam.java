import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		
		double x1 = Double.parseDouble(st.nextToken());
		double y1 = Double.parseDouble(st.nextToken());
		double x2 = Double.parseDouble(st.nextToken());
		double y2 = Double.parseDouble(st.nextToken());
		double x3 = Double.parseDouble(st.nextToken());
		double y3 = Double.parseDouble(st.nextToken());
		double x4 = Double.parseDouble(st.nextToken());
		double y4 = Double.parseDouble(st.nextToken());
		
		double start = dist(x1,y1,x2,y2);
		double end = dist(x3,y3,x4,y4);
		
		System.out.println(Math.max(start, end));
	}
	
	static double dist(double x1, double y1, double x2, double y2) {
		double dx = x1-x2;
		double dy = y1-y2;
		return Math.sqrt(dx*dx+dy*dy);
	}
}
