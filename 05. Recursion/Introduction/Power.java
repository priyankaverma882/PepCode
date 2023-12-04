import java.util.*;

public class Power {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        scn.close();

        int res = Powerfunc(x,n);

        System.out.println(res);
    }
    public static int Powerfunc(int x, int n){
        if(n == 0)
            return 1;

        int mul = Powerfunc(x, n-1);

        mul = mul * x;

        return mul;
    }
}
