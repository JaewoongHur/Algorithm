import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int[] alphabet = new int[26];
		for(int i=0; i<26;i++) {
			alphabet[i] = -1;
		}
		
		for(int i=0;i<S.length();i++) {
			if(alphabet[S.charAt(i)-97] == -1) 
			alphabet[S.charAt(i)-97] = i;
		}
		for(int x : alphabet) {
			System.out.print(x+" ");
		}
		sc.close();
	}
}
