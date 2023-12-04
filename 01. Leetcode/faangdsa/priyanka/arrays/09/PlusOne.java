class PlusOne{

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static void main(String[] args){
        int[] digits = {9,8,7,6,5,4,3,2,1,0};

        //Second way which didnt work giving erreo - NumberFormatException.forInputString
        String ConvertedintoString = "";

        for(int i = 0; i<digits.length; i++){
            ConvertedintoString += String.valueOf(digits[i]);
        }
        int number = Integer.parseInt(ConvertedintoString) + 1;  
        

        int j = 0; 
        int len = Integer.toString(number).length(); 
        int[] arr = new int[len]; 
        while(number!=0) 
        { 
            arr[len-j-1] = number%10; 
            number=number/10; 
            j++; 
        } 
        
    }
}