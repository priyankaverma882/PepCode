import java.util.*;

public class Pattern2 {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sp = n - 1, st = 1; // sp = spaces ; st = stars  for(int i =1; i<=n;i++)
    {
      System.out.println(sp + "," + st);
      sp--;
      st++;
    }
    scn.close();
  }
}