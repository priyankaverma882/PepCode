import java.util.*;

class GetSubsequence {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> alres = gss(str);
        System.out.println(alres);
        scn.close();

    }

    public static ArrayList<String> gss(String str) {

        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);

        String ros = str.substring(1);
        
        ArrayList<String> recAns = gss(ros);

        ArrayList<String> newArr = new ArrayList<>();

        for(String ele : recAns){
            newArr.add(ele);
        }

        for(String ele : recAns){
            newArr.add(ch+ele);
        }

        return newArr;
    }
}
