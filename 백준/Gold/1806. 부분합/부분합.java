import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int val = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		int[] AC = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			AC[i] = AC[i-1] + arr[i]; 
		}
		
		int min = Integer.MAX_VALUE;
		
		int s = 1;
		int e = 1;
		
		while(s<=e && s<=n && e<=n) {
			int sum = AC[e] - AC[s-1];
			if(sum<val) {
				e++;
			}
			else if(sum>=val) {
				min = Math.min(min, e-s+1);
				s++;
			}			
		}
		if(min == Integer.MAX_VALUE || val==0) {
			System.out.println(0);
		}
		else {
			System.out.println(min);
		}
		
	}

}