import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
		StringTokenizer st;
		int[] A;
		for(int i=1; i<=10;i++) {
			int N = Integer.parseInt(br.readLine());
			A = new int[100];
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<100;j++) {
				A[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(A);
			while(N>0) {
				A[99] = A[99]-1;
				A[0]= A[0]+1;
				Arrays.sort(A);
				N--;
			}
			bw.write("#"+i+" "+(A[99]-A[0]));
			bw.newLine();
		}		
		br.close();
		bw.close();
	}
}