import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] A = new int[26];
		int[] B = new int[26];

		String a = br.readLine();
		String b = br.readLine();

		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)==' ')continue;
			A[a.charAt(i) - 'A']++;
		}
		
		for (int i = 0; i < b.length(); i++) {
			if(b.charAt(i)==' ')continue;
			B[b.charAt(i) - 'A']++;
		}
		
		boolean anagram = true;
		
		for(int i=0;i<26;i++) {
			if(A[i] != B[i]) {
				anagram = false;
			}
		}
		
		if(anagram) {
			System.out.println("Is an anagram.");
		}else {
			System.out.println("Is not an anagram.");
		}
	}
}