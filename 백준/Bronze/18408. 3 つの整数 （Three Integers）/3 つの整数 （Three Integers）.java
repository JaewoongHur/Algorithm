import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s= br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
	
		int x = 0;
		int y = 0;
		
		if(a==1){
		x++;
		}else{
		y++;
		}
		if(b==1){
		x++;
		}else{
		y++;
		}
		if(c==1){
		x++;
		}else{
		y++;
		}
		
		if(x>y){
		 System.out.println(1);
		}else{
		System.out.println(2);
		}
	}
}