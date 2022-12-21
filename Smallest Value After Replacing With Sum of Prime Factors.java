class Solution {
    public int smallestValue(int n) {
        while (true) {
			int num = 0; 
			for (int i = 2, x = n; i <= x; i++)
				for (; x % i == 0; x /= i)
					num += i; 
			if (num == n) break; 
			n = num; 
		}
		return n; 
    }
}
