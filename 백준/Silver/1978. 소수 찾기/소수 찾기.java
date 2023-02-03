import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr= new int[N];
		
		int cnt = 0;		
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			int s = (int) Math.sqrt(arr[i]);
			if(arr[i]==1) continue;
			else if (arr[i] == 2) { cnt++; continue;}
			 while(!((arr[i]) % s == 0) && s>1) {
				 s--;
			 }
			if(s==1) cnt++;
		}
		bw.write(String.valueOf(cnt));
		bw.close();		
	}
}
