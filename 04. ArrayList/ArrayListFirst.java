import java.util.ArrayList;
import java.util.Scanner;

class ArrayListFirst{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        // int a = scn.nextInt();
        // System.out.println(a);
        int [] data = {1,3,5,72,13,47,33,89};


        ArrayList<Integer> al = new ArrayList<>();

        al.add(23);

        for(int el : data){
            al.add(el);
        }
        scn.close();
    }
}