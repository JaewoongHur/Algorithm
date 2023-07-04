import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int k = b-a;
        int ans = 0;
        if(k%c==0){
            ans = k/c;
            }
        else{
            ans = k/c + 1;
            }
        System.out.println(ans);
        }
    }