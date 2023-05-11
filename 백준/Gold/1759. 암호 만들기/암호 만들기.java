import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static char[] arr,tmp;
	static int L,C;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		arr = new char[C];
		tmp = new char[L];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<C;i++) {
			arr[i] = st.nextToken().charAt(0);
		}
		
		Arrays.sort(arr);
		
		comb(0,0);
		System.out.println(sb);
	}
	
	private static void comb(int start,int idx) {
		if(idx == L ) {
			int cntv = 0;
			int cntc = 0;
			for(int i=0;i<L;i++) {
				if(tmp[i] == 'a') {
					cntv++;
				}
				else if(tmp[i]=='e') {
					cntv++;
				}
				else if(tmp[i]=='i') {
					cntv++;
				}
				else if(tmp[i]=='o') {
					cntv++;
				}
				else if(tmp[i]=='u') {
					cntv++;
				}
				else {
					cntc++;
				}
			}	
			
			if(cntv<1 || cntc<2) {
				return;
			}
			
			for(int i=0;i<L;i++) {
				sb.append(tmp[i]);
			}
			sb.append('\n');
			return;
		}
		
		for(int i=start;i<C;i++) {
			tmp[idx] = arr[i];
			comb(i+1,idx+1);
		}
		
	}
	
	
}