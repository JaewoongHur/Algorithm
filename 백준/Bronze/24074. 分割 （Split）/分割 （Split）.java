import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine().trim());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		
		int max = 0;
		int maxIdx = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] > max) {
				max = arr[i];
				maxIdx = i;
			}
		}
		
		int sa = 0;
		int sb = 0;
		
		for(int i=0;i<maxIdx;i++) {
			sa += arr[i];
		}
		
		for(int i= maxIdx + 1; i<n;i++) {
			sb += arr[i];
		}
		
		
		System.out.println(sa);
		System.out.println(sb);
		
	}
}