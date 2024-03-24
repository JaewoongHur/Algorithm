import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		int[] arr = new int[] {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		
		int n = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<n;tc++) {
			s = br.readLine();
			
			boolean isPalindrome = true;
			
			for(int i=0;i<s.length()/2;i++) {
				char a = Character.toUpperCase(s.charAt(i));
				char b = Character.toUpperCase(s.charAt(s.length()-1-i));
				
				if(arr[a-'A'] != arr[b-'A']) {
					isPalindrome = false;
					break;
				}
			}
			if(isPalindrome) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}