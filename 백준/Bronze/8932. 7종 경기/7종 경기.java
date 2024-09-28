import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<n;tc++) {
			st = new StringTokenizer(br.readLine());
			
			double[] arr = new double[7];
			
			for(int i=0;i<7;i++) {
				arr[i] = Double.parseDouble(st.nextToken());
			}
			
			int ans = 0;
			
			ans += (int) (9.23076 * Math.pow(26.7-arr[0], 1.835));
			ans += (int) (1.84523 * Math.pow(arr[1]-75, 1.348));
			ans += (int) (56.0211 * Math.pow(arr[2]-1.5, 1.05));
			ans += (int) (4.99087 * Math.pow(42.5-arr[3], 1.81));
			ans += (int) (0.188807 * Math.pow(arr[4]-210, 1.41));
			ans += (int) (15.9803 * Math.pow(arr[5]-3.8, 1.04));
			ans += (int) (0.11193 * Math.pow(254-arr[6], 1.88));
			
			System.out.println(ans);
		}
	}
}