class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;

        int[] colors=new int[n];
        Arrays.fill(colors,-1);

        for(int i=0;i<n;i++){
            if(colors[i]==-1 && !dfs(graph,i,colors,0)){
                return false;
            }
        }
        return true;
    }
    boolean dfs(int[][] graph,int node,int[] colors,int col){
        colors[node]=col;
        for(int it:graph[node]){
            if(colors[it]==col){
                return false;
            }
            if(colors[it]==-1 && !dfs(graph,it,colors,1-col)){
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
