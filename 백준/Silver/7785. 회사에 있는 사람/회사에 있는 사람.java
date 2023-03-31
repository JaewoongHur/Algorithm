import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Map<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			String s1 = s[0];
			String s2 = s[1];
			if (s2.equals("enter")) {
				map.put(s1, s1);
			} else if(s2.equals("leave")){
				if (map.containsKey(s1)) {
					map.remove(s1);
				}
			}
		}
		List<String> list = new ArrayList<>();
		for(String x: map.keySet()) {
			list.add(x);
		}
		Collections.sort(list,Collections.reverseOrder());
		for(String x: list) {
			System.out.println(x);
		}
		
	}
}