import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int res = FactorialRecFunc(n);
        System.out.println(res);
    }

    public static int FactorialRecFunc(int n){
        int res = 0;
        if(n == 1)
            return 1; 
        
        res = FactorialRecFunc(n-1);

        res = res * n;

        return res;
    }

    public static int SecondWay(int n){
        return n==0 ? 1 : n* SecondWay(n);
    }
} 
