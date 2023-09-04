public class buyandsellstocks {

    public static void maxprofit(int prices[])
    {
        int profitM = 0;
        int profit;
        int n = prices.length ;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                profit = prices[j]-prices[i];

                profitM=Math.max(profitM,profit);
            }


        }
        System.out.println(profitM);

    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};

        maxprofit(prices);

    
    }
    
}
