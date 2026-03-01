import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String[] s = new String[3];

			s[0] = br.readLine();
			s[1] = br.readLine();
			s[2] = br.readLine();

			boolean pass = true;

			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (j == k)
						continue;

					if (s[j].length() > s[k].length())
						continue;

					if (s[j].equals(s[k].substring(0, s[j].length()))) {
						pass = false;
						break;
					}

					if (s[j].equals(s[k].substring(s[k].length()-s[j].length(), s[k].length()))) {
						pass = false;
						break;
					}
				}
			}
			
			if(pass) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
