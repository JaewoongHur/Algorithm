import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		double ad = Double.parseDouble(st.nextToken());
		double ed = Double.parseDouble(st.nextToken());
		
		double[] a = new double[10];
		double[] e = new double[10];
		
		int ia = 0;
		int ie = 0;
		
		for(int i=0;i<20;i++) {
			st = new StringTokenizer(br.readLine());
			
			String x = st.nextToken();
			double y = Double.parseDouble(st.nextToken());
			
			if(x.equals("a") || x.equals("A")){
				a[ia] = y;
				ia++;
			}else if(x.equals("e") || x.equals("E")) {
				e[ie] = y;
				ie++;
			}
		}
		
		
		System.out.println("Method 1");
		
		double sa = 0;
		for(int i=0;i<10;i++) {
			sa += a[i];
		}
		
		System.out.printf("African: %.2f furlongs per hour\n", ad*10/sa);
		
		double se = 0;
		for(int i=0;i<10;i++) {
			se += e[i];
		}
		
		System.out.printf("European: %.2f furlongs per hour\n", ed*10/se);
		System.out.println("Method 2");
		
		double avga = 0;
		for(int i=0;i<10;i++) {
			avga += ad/a[i];
		}
		avga /= 10;
		
		System.out.printf("African: %.2f furlongs per hour\n", avga);
		
		double avge = 0;
		for(int i=0;i<10;i++) {
			avge += ed/e[i];
		}
		avge /= 10;
		System.out.printf("European: %.2f furlongs per hour\n", avge);
	}
}
