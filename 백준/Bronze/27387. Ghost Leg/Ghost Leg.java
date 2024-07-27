import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		int[] arr = new int[m];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<m;i++) {
			arr[i] = Integer.parseInt(br.readLine());			
		}
		
		int[] result = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			int a = i;
			for(int j=0;j<m;j++) {
				if(arr[j] == a-1) {
					a--;
				}else if(arr[j] == a) {
					a++;
				}
			}		
			result[a] = i;
		}
		
		for(int i=1;i<=n;i++){
			sb.append(result[i]).append('\n');			
		}
		System.out.println(sb);
	}
}