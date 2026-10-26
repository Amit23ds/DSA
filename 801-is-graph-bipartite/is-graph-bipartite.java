class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;

        int[] colors=new int[n];
        Arrays.fill(colors,-1);

        for(int i=0;i<n;i++){
            if(colors[i]==-1 && !bfs(graph,i,colors)){
                return false;
            }
        }
        return true;
    }
    boolean bfs(int[][] graph,int node,int[] colors){
        Queue<Integer> q=new LinkedList<>();
        q.offer(node);
        colors[node]=0;
        while(!q.isEmpty()){
            int fNode=q.poll();
            int col=colors[fNode];

            for(int it:graph[fNode]){
                if(colors[it]==col){
                    return false;
                }else if(colors[it]==-1){
                    q.offer(it);
                    colors[it]=1-col;
                }
            }
        }
        return true;
    }
}
