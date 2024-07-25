class Solution {
public void merge(int[] nums, int s, int e, int m){
    int l1=m-s+1;
    int l2=e-m;
    int []a1= new int[l1];
    int []a2= new int[l2];
    for(int i=0;i<l1;i++)
    {
        a1[i]=nums[s+i];
    }
    for(int i=0;i<l2;i++)
    {
        a2[i]=nums[m+1+i];
    }
    // System.out.println(Arrays.toString(a1));
    int i=0,k=s,j=0;
    // k ki value s se start hogi!!!!!
    while(i<l1 && j<l2){
        if(a1[i]<a2[j]){
            nums[k]=a1[i];
            i++;
        }
        else{
            nums[k]=a2[j];
            j++;
        }
        k++;
    }
    while(i<l1){
        nums[k]=a1[i];
        k++;
        i++;
    }
    
    while(j<l2){
        nums[k]=a2[j];
        k++;
        j++;
    }
}

    public void mergeSort(int[] nums , int s, int e){
        if(s<e){
            int m=s+(e-s)/2;
            mergeSort(nums,s,m);
            mergeSort(nums,m+1,e);
            merge(nums,s,e,m);
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}