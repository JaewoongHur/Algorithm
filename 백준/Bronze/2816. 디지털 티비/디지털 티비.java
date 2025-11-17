import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] arr = new String[n];
		
		int k1 = 0;
		int k2 = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = br.readLine();
			if(arr[i].equals("KBS1")) {
				k1 = i;
			}else if(arr[i].equals("KBS2")) {
				k2 = i;
			}
		}
		
		if(k1>k2) {
			k2++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<k1;i++) {
			sb.append(1);
		}
		
		for(int i=0;i<k1;i++) {
			sb.append(4);
		}
		
		for(int i=0;i<k2;i++) {
			sb.append(1);
		}
		
		for(int i=0;i<k2-1;i++) {
			sb.append(4);
		}
		
		System.out.println(sb);
	}
}
