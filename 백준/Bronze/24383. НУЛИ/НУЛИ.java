import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine(),"1");
		
		int n = st.countTokens();
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			String s = st.nextToken();
			
			set.add(s.length());
		}
		System.out.println(set.size());		
	}
}
