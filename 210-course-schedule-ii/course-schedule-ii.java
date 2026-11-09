class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int[] indegree=new int[numCourses];

        for(int c=0;c<numCourses;c++){
            adj.add(new ArrayList<>());
        }

        for(int[] temp:prerequisites){
            int cr=temp[0];
            int pre=temp[1];

            adj.get(pre).add(cr);
            indegree[cr]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int[] topo=new int[numCourses];
        int i=0;
        while(!q.isEmpty()){
            int cr=q.poll();
            topo[i++]=cr;
            for(int it:adj.get(cr)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.offer(it);
                }
            }
        }
        if(i!=numCourses){
            return new int[0];
        }
        return topo;
    }
}