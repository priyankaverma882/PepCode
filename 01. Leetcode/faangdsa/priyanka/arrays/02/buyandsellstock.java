class buyandsellstocks {
    public static int maxProfit(int[] prices) {
        if(prices.length==1)
        {
            return 0;

        }
        int profit=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }

            if(prices[i]>min)
            {
                profit+=prices[i]-min;
                min=prices[i];
            }

        }

        return profit;
    }

    public static void main(String[] args)
    {
        int prices[] = {7,1,5,3,6,4};
 
        // removeDuplicates() returns new size of array
        int n = maxProfit(prices);

        System.out.println("Max Profit:"+ n);

    }
}