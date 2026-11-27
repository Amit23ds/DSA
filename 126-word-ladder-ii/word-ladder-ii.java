import java.util.*;

class Solution {
    public List<List<String>> findLadders(String beginWord, 
                                         String endWord, 
                                         List<String> wordList) {

        Set<String> dictionary = new HashSet<>(wordList);
        List<List<String>> ans = new ArrayList<>();

        if (!dictionary.contains(endWord)) return ans;

        Map<String, List<String>> parents = new HashMap<>();
        Set<String> currentLevel = new HashSet<>();

        currentLevel.add(beginWord);
        boolean found = false;

        while (!currentLevel.isEmpty() && !found) {
            Set<String> nextLevel = new HashSet<>();

            for (String word : currentLevel) {
                dictionary.remove(word);
            }

            for (String word : currentLevel) {
                char[] chars = word.toCharArray();

                for (int i = 0; i < chars.length; i++) {
                    char original = chars[i];

                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[i] = c;
                        String changed = new String(chars);

                        if (dictionary.contains(changed)) {
                            nextLevel.add(changed);

                            parents.computeIfAbsent(changed, 
                                k -> new ArrayList<>()).add(word);

                            if (changed.equals(endWord)) {
                                found = true;
                            }
                        }
                    }

                    chars[i] = original;
                }
            }

            currentLevel = nextLevel;
        }

        if (!found) return ans;

        List<String> path = new ArrayList<>();
        path.add(endWord);

        dfs(endWord, beginWord, parents, path, ans);

        return ans;
    }

    private void dfs(String word, String beginWord,
                     Map<String, List<String>> parents,
                     List<String> path, List<List<String>> ans) {

        if (word.equals(beginWord)) {
            List<String> sequence = new ArrayList<>(path);
            Collections.reverse(sequence);
            ans.add(sequence);
            return;
        }

        for (String parent : parents.getOrDefault(word, new ArrayList<>())) {
            path.add(parent);

            dfs(parent, beginWord, parents, path, ans);

            path.remove(path.size() - 1);
        }
    }
}