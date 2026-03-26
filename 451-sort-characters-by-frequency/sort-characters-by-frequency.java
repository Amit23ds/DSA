class Solution {
    private char helper(HashMap<Character,Integer> hm){
        char msf=hm.keySet().iterator().next();
        for(Character key: hm.keySet()){
            if(hm.get(key)>hm.get(msf)){
                msf=key;
            }
        }
        // hm.remove(msf);
        return msf;
    }
    public String frequencySort(String s) {
        StringBuilder sb= new StringBuilder();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        while(hm.size()!=0){
            char ch=helper(hm);
            int freq=hm.get(ch);
            for(int i=0;i<freq;i++){
                sb.append(ch);
            }
            hm.remove(ch);
        }
        return sb.toString();
    }
}   