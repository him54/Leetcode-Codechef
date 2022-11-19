import java.util.*;
import java.io.*
class Solution{
public int maxProfit(int[] prices, int fee) {
    int obsp = -prices[0];
    int ossp = 0;

    for(int i = 0; i<prices.length; i++)
    {
      int nbsp = 0;
      int nssp = 0;
      
      if(ossp - prices[i] > obsp)// Bold state profit
      {
          nbsp = ossp - prices[i];
      }
      else
      {
         nbsp = obsp;  
      }
      
      if(obsp + prices[i] - fee > ossp) // Sold state profit
      {
          nssp = obsp + prices[i] - fee;
      }
      else {
          nssp = ossp;
      }
      obsp = nbsp;
      ossp = nssp;
      
    }
    return ossp;  
 }
}
