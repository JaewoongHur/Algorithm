import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		int[] dpLeft = new int[n];
		int[] dpRight = new int[n];
		dpLeft[0] = 1;
		dpRight[n-1] = 1;
		
		st= new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			A[i] = Integer.parseInt(st.nextToken());			
		}
		
		for(int i=0;i<n;i++) {
			int max = 1;
			for(int j=0;j<i;j++) {
				if(A[j]<A[i]) {
					max = Math.max(dpLeft[j]+1 , max);
				}				
			}	
			dpLeft[i] = max;
		}
		
		for(int i= n-1;i>=0;i--) {
			int max = 1;
			for(int j=n-1;j>i;j--) {
				if(A[i]>A[j]) {
					max = Math.max(dpRight[j]+1, max);
				}				
			}
			dpRight[i] = max;
		}
		
		int max = 0;
		for(int i=0;i<n;i++) {
			max = Math.max(dpLeft[i]+dpRight[i]-1, max);
		}
		System.out.println(max);
	}
}