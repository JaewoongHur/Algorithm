import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			int n = Integer.parseInt(s);
			
			st = new StringTokenizer(br.readLine());
			
			double[] arr = new double[n];
			
			int num = 0;
			
			double sum = 0;
			
			for(int i=0;i<n;i++) {
				arr[i] = Double.parseDouble(st.nextToken());
				sum += arr[i];
			}
			
			double avg = sum / n;
			
			for(int i=0;i<n;i++) {
				if(avg>=arr[i]) {
					num++;
				}
			}
			
			System.out.println(num);
		}
	}
}
