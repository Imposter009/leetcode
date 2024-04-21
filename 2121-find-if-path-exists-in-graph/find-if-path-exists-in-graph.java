class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
    //    creating a graph 
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int[] edge : edges) {
            int node0 = edge[0], node1 = edge[1];
            List<Integer> list0 = map.getOrDefault(node0, new ArrayList<Integer>());
            List<Integer> list1 = map.getOrDefault(node1, new ArrayList<Integer>());
            list0.add(node1);
            list1.add(node0);
            map.put(node0, list0);
            map.put(node1, list1);
        }
        // to keep account of visited nodes
        boolean[] visited = new boolean[n];
        // to find the path
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[source] = true;
        queue.add(source);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == destination)
                return true;
            List<Integer> list = map.getOrDefault(node, new ArrayList<Integer>());
            for (int next : list) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
        return false;
    }
}
  