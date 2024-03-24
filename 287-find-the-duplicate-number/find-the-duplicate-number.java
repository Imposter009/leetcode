class Solution {
    public int findDuplicate(int[] nums) {
        // this question is same as finding cycle in linkedlist
        // we will use 2 pointers to find the index at which there is a repeating value
        int slow=0;
        int fast=0;
        do{
            // in this loop we are finding the position at which is both the pointers will meet
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        while(slow!=fast);
        fast=0;
        // now we will us the same approach that we use to find the starting point of cycle in linkedlist i.e move the slow pointer one from the point of meeting and move the fast pointer one from the starting of the linkedlist. the point where they meet again will be our ans
        while(fast!=slow)
        {
            fast=nums[fast];
            slow=nums[slow];
        }
return fast;
    }
}