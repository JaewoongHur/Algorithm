import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[26];

        String s = br.readLine();
        int L = s.length();

        int x = 0;
        int t = 0;

        int max = 0;

        for (int i = 0; i < L; i++) {
            boolean p = false;
            if(i>=1 && arr[s.charAt(i-1)-'a'] != 0){
                arr[s.charAt(i-1)-'a']--;
                p=true;
            }
            if(p && arr[s.charAt(i-1)-'a']==0){
                t--;
            }
            while (t <= n && x < L) {
                if (arr[s.charAt(x) - 'a'] == 0) {
                    t++;
                }
                    arr[s.charAt(x) - 'a']++;

                if (t<=n && max < x - i + 1) {
                    max = x - i + 1;
                }
                x++;
            }
        }
        System.out.println(max);
    }
}
