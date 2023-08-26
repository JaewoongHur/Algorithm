import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		boolean[] num = new boolean[1000001];
		int[] score = new int[1000001];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			num[arr[i]] = true;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=arr[i]*2;j<1000001;j+=arr[i]) {
				if(num[j]) {
					score[arr[i]]++;
					score[j]--;
				}
			}			
		}
		for(int i=0;i<n;i++) {
			sb.append(score[arr[i]] +" ");
		}
		System.out.println(sb);
	}
}