import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int n = Integer.parseInt(s);
        for(int i=1;i<=n;i++) {
        	sb.append(String.valueOf(i));
        }
        String total = sb.toString();
        
        int  x = 0;
        
        for(int i=0;i<total.length()-s.length()+1;i++) {
        	int cnt = 0;
        	for(int j=0;j<s.length();j++) {
        		if(total.charAt(i+j) == s.charAt(j)) {
        			cnt++;
        		}
        	}
        	if(cnt==s.length()) {
        		x = i;
        		break;
        	}
        }
        System.out.println(x+1);
        
    }
}