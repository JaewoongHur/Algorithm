import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<3;i++) {
			for(int j=1;j<=n;j++) {
				sb.append(j).append(' ');
			}
		}
		
		System.out.println(sb);
	}
}
