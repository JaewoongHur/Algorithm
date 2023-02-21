import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double sum =0;
		double sa = 0;
		for(int i=0;i<20;i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			double a = Double.parseDouble(st.nextToken());
			String g = st.nextToken();
			double b = 0;
			switch(g) {
			case "A+":
				b = 4.5;
				break;
			case "A0":
				b = 4.0;
				break;
			case "B+":
				b = 3.5;
				break;
			case "B0":
				b = 3.0;
				break;
			case "C+":
				b = 2.5;
				break;
			case "C0":
				b = 2.0;
				break;
			case "D+":
				b = 1.5;
				break;
			case "D0":
				b = 1.0;
				break;
			case "F":
				b = 0.0;
				break;
			case "P":
				a = 0.0;
				b = 0.0;
				break;
			default:
				b=0;
				break;
			}
			
			sum += a * b;	
			sa += a;
		}
		System.out.println(sum/sa);	
	}
}