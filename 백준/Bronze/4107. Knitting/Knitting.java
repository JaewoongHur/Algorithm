import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		String s;
		
		while(!((s=br.readLine()).equals("0 0 0"))){
			st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[k];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<k;i++) {
				arr[i] = Integer.parseInt(st.nextToken());				
			}
			
			int sum = n;
			
			int a = n;
			
			for(int i=0;i<m-1;i++) {
				a += arr[i%k];
				sum += a;
			}
			
			System.out.println(sum);
		}
	}
}