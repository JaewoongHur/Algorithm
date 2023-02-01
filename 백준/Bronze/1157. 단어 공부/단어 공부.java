import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String US = S.toUpperCase();
		
		int[] arr = new int[26];
		for(int i=0; i<US.length(); i++) {
			arr[US.charAt(i)-65]++;
		}
		int max = -1157;
        char t = 0;
		for(int i=0; i<26; i++) {
			if(arr[i]>max) {
				max = arr[i];
				t = (char)(i+65);
			}
			else if(arr[i]==max) {
				t = '?';
			}
		}

		System.out.println(t);
		sc.close();
		}
}
