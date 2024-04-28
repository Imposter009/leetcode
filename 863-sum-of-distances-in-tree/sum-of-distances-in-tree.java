class Solution {
     int result_base_node = 0;
      int[] count;
       int N;
    public int DFSBase(Set<Integer>[]graph,int current,int depth,int previous){
         int total_node = 1;
          result_base_node += depth;
        for(int v:graph[current]){
            if(v==previous)continue;
            total_node +=DFSBase(graph,v,depth+1,current);
        }
        count[current] = total_node;
        return total_node;
    }
     void DFS( Set<Integer>[]graph, int parent_node, int prev_node, int[] ans) {
        
        for(int v:graph[parent_node]){
            if(v==prev_node)continue;
           ans[v] = ans[parent_node] - count[v] + (N - count[v]);
            DFS(graph, v, parent_node, ans);
        }
            
        
    }
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        Set<Integer>[] graph=new Set[n];
        count = new int[n];
        int[] ans = new int[n];
          N = n;
        Arrays.fill(count, 0);
         Arrays.fill(ans, 0);
        for(int i=0;i<n;i++){
            graph[i]=new HashSet<>();
        }
        for(int[]edge:edges){
            int a=edge[0];
            int b=edge[1];
            graph[a].add(b);
            graph[b].add(a);
        }
       
        DFSBase(graph,0,0,-1);
        ans[0]= result_base_node;
        DFS(graph, 0, -1, ans);


        return ans;
    }
}