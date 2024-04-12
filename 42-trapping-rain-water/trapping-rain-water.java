class Solution {
    public int trap(int[] height) {
             int n = height.length;
        Stack<Integer> st = new Stack<>();
        int water = 0;

        for (int i = 0; i < n; i++) {
            // This is actually the concept of monotonic stack
            while (!st.isEmpty() && height[i] > height[st.peek()]) {
                // It means "mid" is bounded from left (i.e. height[st.top()]) and right(i.e. height[i])
                int mid = st.pop();

                // But, for bounding mid, we need left (height[st.top()])
                if (st.isEmpty()) {
                    break; // no left bound found
                }

                int right = i;
                int left = st.peek();

                int h = Math.min(height[right], height[left]) - height[mid];
                int w = right - left - 1;

                water += (h * w);
            }
            st.push(i);
        }

        return water;
    }
}
--------------------------------------------------------------------------------------------------------------------------
    //T.C : O(n)
//S.C : O(n)
public class Solution {
    public int[] getLeftMax(int[] height, int n) {
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        return leftMax;
    }

    public int[] getRightMax(int[] height, int n) {
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        return rightMax;
    }

    public int trap(int[] height) {
        int n = height.length;
        if (n == 1 || n == 0)
            return 0;
        
        int[] leftMax = getLeftMax(height, n);
        int[] rightMax = getRightMax(height, n);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return sum;
    }
}
