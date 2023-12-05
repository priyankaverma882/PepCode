import java.io.*;

//import java.util.*;

public class PowerLog {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new
    BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());
    int p = power(x, n);
    System.out.println(p);
  }

  public static int power(int x, int n) {
    if (n == 0) {
      return 1;
    }
    int xpnb2 = power(x, n / 2);
    // n/2 will automatically get floor value
    // since it is type casted to int.

    int xpn = xpnb2 * xpnb2;

    if (n % 2 == 1) {
      xpn = xpn * x;
    }

    return xpn;
  }

}