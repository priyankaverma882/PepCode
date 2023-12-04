import java.util.*;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
        
        char temps[] = s.toCharArray();
        char tempt[] = t.toCharArray();

        Arrays.sort(temps);
        Arrays.sort(tempt);

        String sn = new String(temps);
        String tn = new String(tempt);

        for(int i = 0; i< tn.length(); i++)
            if(sn.charAt(i) != tn.charAt(i))
                return false;
        
        return true;
    }
    public static void main(String[] args)
    {
        String s ="cat";
        String t = "tac";
 
        boolean n = isAnagram(s,t);

        System.out.println("Max Profit:"+ n);

    }
}