import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0 0 0")) {
				break;
			}
			
			
			st = new StringTokenizer(s);
			
			int n = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[k+1];
			
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j=0;j<c;j++) {
					int a = Integer.parseInt(st.nextToken());
					arr[a]++;
				}
			}
			
			int min = Integer.MAX_VALUE;
			
			for(int i=1;i<=k;i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			
			for(int i=1;i<=k;i++) {
				if(min == arr[i]) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}
}