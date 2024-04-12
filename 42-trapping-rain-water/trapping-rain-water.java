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