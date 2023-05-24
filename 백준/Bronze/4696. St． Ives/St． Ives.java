import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String s;
		
		while((s=br.readLine())!=null) {
			if(s.equals("0")) {
				break;
			}
			
			double a = Double.parseDouble(s);
			double ans = Math.pow(a, 0)+Math.pow(a, 1)+Math.pow(a, 2)+Math.pow(a, 3) + Math.pow(a,4);
			System.out.printf("%.2f",ans);
			System.out.println();			
		}
		
	}
}