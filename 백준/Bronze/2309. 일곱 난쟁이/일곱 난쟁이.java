import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        int sum = 0;
        for (int tc = 0; tc < 9; tc++) {
            arr[tc] = Integer.parseInt(br.readLine());
            sum += arr[tc];
        }
        Arrays.sort(arr);

        int a = 0;
        int b = 0;

        for(int i=0;i<9;i++){
            for(int j=i+1;j<9;j++){
                if(sum-arr[i]-arr[j]==100){
                    a=i;b=j;
                    break;
                }
            }
        }

        for(int i=0;i<9;i++){
            if(i==a || i==b){
                continue;
            }
            System.out.println(arr[i]);
        }

    }
}