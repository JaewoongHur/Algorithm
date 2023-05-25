import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		
		while((s=br.readLine())!=null) {
			if(s.equals("-1.0")) {
				break;
			}
			double x = Double.parseDouble(s);
			double y = x*0.167;
			
			System.out.print("Objects weighing ");
			System.out.printf("%.2f",x);
			System.out.print(" on Earth will weigh ");
			System.out.printf("%.2f",y);
			System.out.print(" on the moon.");
			System.out.println();
		}
	}
}