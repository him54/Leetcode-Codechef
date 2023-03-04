import java.util.*;
class Solution {
    public long coloredCells(int N) {
        // int num1 = (n) * (n);
        // int num2 = (n - 1) * (n - 1);
        return 1L * N * N + 1L * (N-1) * (N-1);
    }
}
