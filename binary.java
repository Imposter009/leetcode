class binary {
    public static void main(String[] args) {
        int[] a = { -1, 0,2,3,9, 11};
        int t = 11;
        System.out.println(search(a, t));
    }

    public static int search(int[] nums, int target) {
        int s = 0;
        int f = 0;
        int e = nums.length;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            System.out.println(mid+""+ " "+ s+" "+e);
            if (nums[mid] == target) {f=mid;
                return mid+1;
            }
             else if (nums[mid] > target)
                e = mid - 1;
            else if (nums[mid] < target)
                s = mid + 1;
        }
        return f;
    }
}