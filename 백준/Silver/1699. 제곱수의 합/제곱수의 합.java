import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[100001];

        for(int i=1;i<317;i++){
            dp[i*i] = 1;
        }


        for(int i=2;i<=N;i++){
            int k = (int) Math.sqrt(i);
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                min = Math.min(min,dp[i-j*j]+1);
            }
            dp[i] = min;
        }
        System.out.println(dp[N]);

    }
}