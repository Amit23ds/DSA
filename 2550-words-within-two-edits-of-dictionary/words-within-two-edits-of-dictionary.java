class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<dictionary.length;j++){
                String st = queries[i];
                String vst = dictionary[j];
                int cnt=0;
                for(int k=0;k<st.length();k++){
                    if(st.charAt(k)!=vst.charAt(k)){
                        cnt++;
                    }
                }
                if(cnt<=2){
                    list.add(st);
                    break;
                }
            }
        }
        return list;
    }
}