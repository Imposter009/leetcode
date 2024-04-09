class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int len=tickets.length;
        int time=0;
        int tic=tickets[k];
   
            while(tickets[k]>0)
            {
                for(int i=0;i<len;i++){
                if(tickets[i]>0){
                time++;
                tickets[i]=tickets[i]-1;
                }
                if(tickets[k]==0)return time;
                }
            }
        return time;
        }
}