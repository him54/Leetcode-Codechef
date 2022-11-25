import java.util.*;
import java.io.*;
class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        
		TreeMap<Integer, List<int[]>> map = new TreeMap<>();
        
        for(int[] arr: buildings){
            map.putIfAbsent(arr[0], new ArrayList<>());
            map.putIfAbsent(arr[1], new ArrayList<>());
            map.get(arr[0]).add(arr);
            map.get(arr[1]).add(arr);
        }
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[2]-a[2]);
        
		ArrayList<List<Integer>> sb = new ArrayList<>();
        
		
        for(int a : map.keySet()){
            List<int[]> bs = map.get(a);
            for(int[] arr : bs)
            {
                if (arr[0] == a)
                {
                    maxHeap.offer(arr);
                }
                else{
                    maxHeap.remove(arr);
                }
            }
        
            
            if (maxHeap.size() == 0)
            {
              ArrayList<Integer> list = new ArrayList<>();
                list.add(a);
                list.add(0);
                sb.add(list);
            }
            else{
                int maxHeight = maxHeap.peek()[2];
                
				
                if (sb.size() == 0 || sb.get(sb.size()-1).get(1) != maxHeight)
                {
                    ArrayList<Integer> list1 = new ArrayList<>();
                    list1.add(a);
                    list1.add(maxHeight);
                    sb.add(list1);
                }
            }
            
        }
        return sb;
    }
}
