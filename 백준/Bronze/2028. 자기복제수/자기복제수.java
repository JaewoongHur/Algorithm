import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int tc=1; tc<=n;tc++) {
        	String s = br.readLine();
        	
        	int m = s.length();
        	
        	int a = Integer.parseInt(s);
        	
        	int b = a * a;
        	
        	String s2 = String.valueOf(b);
        	
        	boolean pos = true;
        	for(int i=s2.length()-1;i>=s2.length()-m;i--) {
        		if(s.charAt(i-s2.length()+m) != s2.charAt(i)) {
        			pos = false;
        			break;
        		}
        	}
        	
        	if(pos) {
        		System.out.println("YES");
        	}
        	else {
        		System.out.println("NO");
        	}
        	
        }
        
    }  
}