import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		int max = 0;
		
		int[] arr = new int[4];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<4;j++) {
			arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			int sum = 0;
			
			if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3]) {
				sum = 50000+5000*arr[0];
			}
			else if((arr[0]==arr[1] && arr[1]==arr[2]) || (arr[1]==arr[2] && arr[2]==arr[3]) ) {
				sum = 10000 + arr[1] * 1000;
			}
			else if(arr[0]==arr[1]&& arr[2]==arr[3]) {
				 sum = 2000 + 500*(arr[0]+arr[2]);
			}
			else if(arr[0]==arr[1]) {
				sum = 1000 + 100 * arr[0]; 
			}
			else if(arr[1]==arr[2]) {
				sum = 1000 + 100 * arr[1];
			}
			else if(arr[2]==arr[3]) {
				sum = 1000 + 100 * arr[2];
			}
			else {
				sum = 100 * arr[3];
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);	
	}
}