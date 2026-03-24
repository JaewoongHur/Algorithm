import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		double x = Double.parseDouble(st.nextToken());
		double y = Double.parseDouble(st.nextToken());
		double x1 = Double.parseDouble(st.nextToken());
		double y1 = Double.parseDouble(st.nextToken());
		double x2 = Double.parseDouble(st.nextToken());
		double y2 = Double.parseDouble(st.nextToken());
		
		double d = 0;
		
		if(x<x1 && y>y2) {
			d = Math.sqrt((x-x1)*(x-x1) + (y-y2)*(y-y2));
		}else if(x>=x1 && x<=x2 && y>y2) {
			d = y-y2;
		}else if(x>x2 && y>y2) {
			d = Math.sqrt((x-x2)*(x-x2) + (y-y2)*(y-y2));
		}else if(x>x2 && y<=y2 && y>=y1) {
			d = x-x2;
		}else if(x>x2 && y<y1) {
			d = Math.sqrt((x-x2)*(x-x2) + (y-y1)*(y-y1));
		}else if(x<=x2 && x>=x1 && y<y1) {
			d = y1-y;
		}else if(x<x1 && y<y1) {
			d = Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
		}else {
			d = x1-x;
		}
		
		System.out.println(d);
	}
}
