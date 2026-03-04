import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		HashSet<String> set = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		
		boolean duplicate = false;
		
		int m = st.countTokens();
		
		for(int i=0;i<m;i++) {
			String s = st.nextToken();
			if(set.contains(s)) {
				duplicate = true;
				break;
			}
			set.add(s);
		}
		
		if(duplicate) {
			System.out.println("no");
		}else {
			System.out.println("yes");
		}
		
	}
}
