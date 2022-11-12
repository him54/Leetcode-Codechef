import java.util.*;
class MedianFinder {
  ArrayList<Integer> list = new ArrayList<>();
    public void addNum(int num) {
	    int n = list.size();
	    int low = 0 ; 
	    int high = n-1;
	    while(low<=high)
        {    		
		    int mid = low + (high-low)  / 2;    		
		    int temp = list.get(mid);
		    if(num <= temp)
            {
			    high = mid -1;
		    }
            else{
			    low = mid +1 ;
		    }
	    }    	
    list.add(low,num);
}
    public double findMedian()
    {
        int n = list.size();
	    if(n == 0)
        {
            return 0;
        }
	    if(n % 2 == 1)
        {
            return list.get(n / 2);
        }
	    else{
            return(list.get(n/2-1) + list.get(n/2))/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
