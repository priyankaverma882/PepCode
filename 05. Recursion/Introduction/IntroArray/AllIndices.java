import java.io.*;

public class AllIndices {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here

        if(idx == arr.length){
            return new int[fsf];
        }

        if(arr[idx] == x){
            fsf = fsf + 1;
        }

        int[] res;

        res = allIndices(arr, x, idx + 1, fsf);

        System.out.println("res length 2 "+ res.length);

        if(arr[idx] == x){
            res[fsf - 1] = idx;
        }

        return res;
    }

}

/*
 * if(idx == arr.length){
            return new int[fsf];
        }

        int[] res;

        System.out.println("fsf before "+ fsf);
        if(arr[idx] == x){
            fsf = fsf + 1;
            res = allIndices(arr, x, idx + 1, fsf);
            res[fsf - 1] = idx;
            System.out.println("res "+ res[fsf - 1]);
        }
        else{
            res = allIndices(arr, x, idx + 1, fsf);
        }


        return res;
 */