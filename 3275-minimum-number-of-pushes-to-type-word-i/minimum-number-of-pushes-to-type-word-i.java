class Solution {
    public int minimumPushes(String word) {
        int n =word.length();
        int[] freq= new int[26];
        for(char ch : word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int ans =0;
        for(int i=25;i>=0;i--){
            ans+=freq[i]*(((25-i)/8)+1);
        }
        return ans;


        // if(n<=8) return n;
        // else if(n>=9 && n<16) return 8+(n%8)*2;
        // else if(n==16) return 24;
        // else if(n>=17 && n<24) return 24+(n%8)*3;
        // else if(n==24) return 48  ;
        // return 48+(n%8)*4;
        
        
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // int assignKey=2;
        // if(n<=8) return n;
        // int cnt=0;
        // for(int i=0;i<n;i++){
        //     if(assignKey >9){
        //         assignKey=2;
        //     }
        //     hm.put(assignKey,hm.getOrDefault(assignKey,0)+1);
        //     cnt+=hm.get(assignKey);
        //     assignKey++; 
        // }
        // return cnt;
    }
}