import java.util.*;

public class FirstIndex {
  public static void main(String[] args) throws Exception {

      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      int []a = new int[n];

      for (int i = 0; i < n; i++)
      {
        a[i] = scn.nextInt();
      }

      int x = scn.nextInt();
      int firstarray = FirstIndexfunc(a, 0, x);
      System.out.println(firstarray);
      scn.close();

    }

    public static int FirstIndexfunc(int[] a, int idx, int x){

      if(x == a[idx]){
          return idx + 1;
      }

      if(idx == a.length - 1){
        return -1;
      }

      int res = FirstIndexfunc(a, idx + 1, x);

      return res;

    }
}
