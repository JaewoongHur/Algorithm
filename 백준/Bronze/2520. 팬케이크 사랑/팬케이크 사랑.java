import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=n;tc++) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			
			double[] arr = new double[5];
			
			double min = 1000000;
			
			double a = Double.parseDouble(st.nextToken());
			
			if(a/8<min) {
				min = a/8;
			}
			double b = Double.parseDouble(st.nextToken());
			if(b/8<min) {
				min = b/8;
			}
			double c = Double.parseDouble(st.nextToken());
			if(c/4<min) {
				min = c/4;
			}
			double d = Double.parseDouble(st.nextToken());
			if(d<min) {
				min = d;
			}
			double e = Double.parseDouble(st.nextToken());
			if(e/9<min) {
				min = e/9;
			}
			
			min = Math.floor(16*min);
			
			double ans = 0;
			
			st = new StringTokenizer(br.readLine());
			
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			double z = Double.parseDouble(st.nextToken());
			double w = Double.parseDouble(st.nextToken());
			
			ans += Math.floor(x);
			ans += Math.floor(y/30);
			ans += Math.floor(z/25);
			ans += Math.floor(w/10);
			
			if(ans>=min) {
				System.out.println((int)min);
			}
			else {
				System.out.println((int)ans);
			}
		}
	}
}