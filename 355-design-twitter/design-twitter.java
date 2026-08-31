class Twitter {
    HashMap<Integer,List<int[]>> tw=new HashMap<>();
    HashMap<Integer,Set<Integer>> fl=new HashMap<>();
    int time=0; 
    public Twitter() {
        
    }
    
    public void postTweet(int userId, int tweetId) {
        tw.putIfAbsent(userId,new ArrayList<>());
        tw.get(userId).add(new int[]{time++,tweetId});
        
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(
                        (a,b)->a[0]-b[0]
                                        );
        if(tw.containsKey(userId)){
            for(int[] tweet:tw.get(userId)){
                pq.offer(tweet);
                if(pq.size()>10){
                    pq.poll();
                }
            }
        }
        if(fl.containsKey(userId)){
            for(int foll:fl.get(userId)){
                if(tw.containsKey(foll)){
                    for(int[] tweet:tw.get(foll)){
                        pq.offer(tweet);
                        if(pq.size()>10){
                            pq.poll();
                        }
                    }
                }
            }
        }
        LinkedList<Integer> res=new LinkedList<>();
        while(!pq.isEmpty()){
            res.addFirst(pq.poll()[1]);
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        fl.putIfAbsent(followerId,new HashSet<>());
        fl.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(fl.containsKey(followerId)){
            fl.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */