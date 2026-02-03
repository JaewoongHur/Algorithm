import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		double lab = Double.parseDouble(st.nextToken());
		double hw = Double.parseDouble(st.nextToken());
		double proj = Double.parseDouble(st.nextToken());
		double exam = Double.parseDouble(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		double[] s = new double[4];
		double[] t = new double[4];
		
		
		for(int i=0;i<n;i++) {
			String[] a = br.readLine().split(" ");
			
			String[] b =  a[2].split("/");
			
			double c = Double.parseDouble(b[0]);
			double d = Double.parseDouble(b[1]);
			
			if(a[0].equals("Lab")) {
				s[0] += c;
				t[0] += d;
			}else if(a[0].equals("Hw")) {
				s[1] += c;
				t[1] += d;
			}else if(a[0].equals("Proj")){
				s[2] += c;
				t[2] += d;
			}else {
				s[3] += c;
				t[3] += d;
			}
		}
		
		double ans = lab*(s[0]/t[0]) + hw*(s[1]/t[1]) + proj*(s[2]/t[2]) + exam*(s[3]/t[3]);
		
		System.out.println((int) Math.floor(ans));
		
	}
}
