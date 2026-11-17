class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int c=0;c<numCourses;c++){
            adj.add(new ArrayList<>());
        }
        boolean[] vis=new boolean[numCourses];
        boolean[] pathVis=new boolean[numCourses];
        for(int[] temp:prerequisites){
            int cr=temp[0];
            int pre=temp[1];

            adj.get(pre).add(cr);
        }
        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
                if(dfs(i,vis,pathVis,adj)){
                    return false;
                }
            }
        }
        return true; 
    }
    boolean dfs(int i,boolean[] vis,boolean[] pathVis,ArrayList<ArrayList<Integer>> adj){
        vis[i]=true;
        pathVis[i]=true;
        for(int it:adj.get(i)){
            if(!vis[it]){
                if(dfs(it,vis,pathVis,adj)) return true;
            }else if(pathVis[it]){
                return true;
            }
            
        }
        pathVis[i]=false;
        return false;
    }
}