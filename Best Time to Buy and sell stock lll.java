class Solution {
public int maxProfit(int[] prices) {

  int mpist = 0;
  int leastsf = prices[0] ;
  int[] dpl = new int[prices.length];

  for(int i = 1; i<prices.length; i++)
  {
       if(prices[i] < leastsf)
        {
            leastsf = prices[i];
        }
        
        mpist = prices[i] - leastsf;
        if(mpist > dpl[i - 1])
        {
            dpl[i] = mpist;
        }else{
            dpl[i] = dpl[i - 1];
        }
    }
    int mpibt = 0;
    int maxat = prices[prices.length - 1];
    int[] dpr = new int[prices.length];
    for(int i = prices.length - 2; i>=0; i--){
        if(prices[i] > maxat){
            maxat = prices[i];
        }
        mpibt = maxat - prices[i];
        if(mpibt >  dpr[i + 1])
        {
            dpr[i]  = mpibt;
        }
        else{
            dpr[i] = dpr[i + 1];
        }
        
    }
    int op = 0; // Original profit
    for(int i = 0; i<prices.length; i++){
        if(dpl[i] + dpr[i] > op){
            op = dpl[i] + dpr[i];
        }
    }
    return op;
    }
  }
