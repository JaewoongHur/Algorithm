import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		double r = Double.parseDouble(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		double c = Double.parseDouble(st.nextToken());
		
		double x0 = a; double y0 = b; double z0 = c;
		
		double sum = 0;
		
		for(int i=1;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			double z = Double.parseDouble(st.nextToken());
			
			double d = Math.sqrt((a-x)*(a-x)+(b-y)*(b-y)+(c-z)*(c-z));
			
			sum += 2*Math.PI*(r-d/2)*(r-d/2)*(2*r+d/2)/3;
			
			a = x;
			b = y;
			c = z;
		}	
		
		double d = Math.sqrt((a-x0)*(a-x0)+(b-y0)*(b-y0)+(c-z0)*(c-z0));
		
		sum += 2*Math.PI*(r-d/2)*(r-d/2)*(2*r+d/2)/3;
		
		double volume = 4*Math.PI*r*r*r/3*n;
		
		System.out.println(volume-sum);
	}
}