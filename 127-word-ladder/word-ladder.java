class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String> st=new HashSet<>(wordList);

        int n=wordList.size();
        st.remove(beginWord);
        while(!q.isEmpty()){
            String word=q.peek().first;
            int step=q.peek().sec;
            q.remove();
            if(word.equals(endWord)==true) return step;
            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char temp[]=word.toCharArray();
                    temp[i]=ch;
                    String tempWord=new String(temp);
                    if(st.contains(tempWord)){
                        st.remove(tempWord);
                        q.add(new Pair(tempWord,step+1));
                    }
                }
            }
        }
        return 0;
    }
}
class Pair{
    String first;
    int sec;
    Pair(String first,int sec){
        this.first=first;
        this.sec=sec;
    }
}