import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);   
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
        
        int[] arr = new int[3];
        arr[0] = a; arr[1] = b; arr[2] = c;
        Arrays.sort(arr);
        a = arr[0]; b = arr[1]; c = arr[2];
        if(a*a + b*b == c*c){
            System.out.println(1);
        }
        else if(a==b && b==c){
            System.out.println(2);
        }
        else{
            System.out.println(0);
        }
    }    
}