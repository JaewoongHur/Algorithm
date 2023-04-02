import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
                arr[i][0] = s[0];
                arr[i][1] = s[1];
            }
        
        set.add("ChongChong");
        for(int i=0;i<n;i++) {
        	if(set.contains(arr[i][0])||set.contains(arr[i][1])) {
        		set.add(arr[i][0]);
        		set.add(arr[i][1]);
        	}
        }
        
        System.out.println(set.size());
    }
}