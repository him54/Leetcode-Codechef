import java.util.*;
class SmallestInfiniteSet {
    TreeSet<Integer> set; // TreeSet internally maintained the elements in located order and it is since it's a set it hold all the properties of the set
    public SmallestInfiniteSet() { //O(1)
        set = new TreeSet<>();
        for(int i = 1; i<=1000; i++){
            set.add(i);
        }
    }
    
    public int popSmallest() { //O(logn)
        return set.pollFirst(); //First lowest element is removed
    }
    
    public void addBack(int num) { //O(logn)
        set.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
