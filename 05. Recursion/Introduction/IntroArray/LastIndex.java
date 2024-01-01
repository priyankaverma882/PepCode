import java.util.*;

public class LastIndex {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
  
        int []a = new int[n];
  
        for (int i = 0; i < n; i++)
        {
          a[i] = scn.nextInt();
        }
  
        int x = scn.nextInt();
        int LastIndex = LastIndexfunc(a, 0, x);
        System.out.println(LastIndex);
        scn.close();
  
      }

      public static int LastIndexfunc(int[] a, int idx, int x){
        if(idx == a.length){
            return -1;
        }

        int res = LastIndexfunc(a, idx + 1, x);

        if(a[idx] == x && res == -1){
            res = idx + 1;
        }
        return res;
      }
}
