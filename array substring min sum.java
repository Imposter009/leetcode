/*Input: arr = [3,1,2,4]
Output: 17
Explanation: 
Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. 
Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
Sum is 17.*/
class Solution {
    public int sumSubarrayMins(int[] A) {
        if(A == null || A.length == 0) return 0;
        long sum = 0;
        for(int i = 0; i < A.length; i++){
            int min = A[i];
            for(int j = i; j < A.length; j++){
                min = Math.min(A[j], min);
                sum += min;
            }
        }
        return (int)(sum % (Math.pow(10, 9) + 7));
    }
}


--
class Solution {
    public int sumSubarrayMins(int[] arr) {
        long total = 0;
        long MOD = 1_000_000_007;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (stack.size() > 1 && arr[stack.peek()] >= arr[i]) {
                int currE = stack.pop();
                int leftBound = stack.peek();
                int rightBound = i;
                long numOfSubArrays = (currE - leftBound) * (rightBound - currE);
                total += (arr[currE] * numOfSubArrays);
                total %= MOD; 
            }

            stack.push(i);
        }
        while (stack.size() > 1) {
            int currE = stack.pop();
            int leftBound = stack.peek();
            int rightBound = n;
            long numOfSubArrays = (currE - leftBound) * (rightBound - currE);
            total += (arr[currE] * numOfSubArrays); 
            total %= MOD;
        }

        return (int)total;
        
    }
}