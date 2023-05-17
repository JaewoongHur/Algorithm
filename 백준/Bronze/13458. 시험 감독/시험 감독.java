import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		long min = 0;
		
		for(int i=0;i<N;i++) {
			if(arr[i]>B) {
				min++;
				
				int k = arr[i]-B;
				
				if(k%C==0) {
					min += k/C;
				}
				else {
					min += k/C+1;
				}
			}
			else {
				min++;
			}
			
		}	
		System.out.println(min);
	}
}