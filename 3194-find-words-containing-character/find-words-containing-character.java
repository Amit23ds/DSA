class Solution {
    private boolean contains(String words, char x){
        for(int i=0;i<words.length();i++){
            char ch= words.charAt(i);
            if(ch==x){
                return true;
            }
        }
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(contains(words[i],x)==true){
                list.add(i);
            }
        }
        return list;
    }
}