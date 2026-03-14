import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		HashSet<Double> set = new HashSet<>();
		
		for(int i=n;i<=m;i++) {
			for(int j=n;j<=m;j++) {
				set.add((double)i/(double)j);
			}
		}
		
		System.out.println(set.size());
	}
}
