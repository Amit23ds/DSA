import java.util.*;

class Solution {
    Map<Integer, List<Integer>> adj;
    int[] tin, tout, depth, parentMask;
    int[][] up;
    int[] segTree, lazy;
    int timer, n, log;

    void dfs(int node, int parent, int d, int mask, char[] s) {
        tin[node] = timer++;
        depth[node] = d;
        up[node][0] = parent;
        parentMask[node] = mask ^ (1 << (s[node] - 'a'));

        for (int child : adj.getOrDefault(node, new ArrayList<>())) {
            if (child != parent) {
                dfs(child, node, d + 1, parentMask[node], s);
            }
        }
        tout[node] = timer - 1;
    }

    void buildLCA() {
        for (int j = 1; j < log; j++) {
            for (int i = 0; i < n; i++) {
                int p = up[i][j - 1];
                if (p != -1) up[i][j] = up[p][j - 1];
            }
        }
    }

    int getLCA(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        int diff = depth[u] - depth[v];
        for (int j = 0; j < log; j++) {
            if ((diff & (1 << j)) != 0) u = up[u][j];
        }

        if (u == v) return u;

        for (int j = log - 1; j >= 0; j--) {
            if (up[u][j] != up[v][j]) {
                u = up[u][j];
                v = up[v][j];
            }
        }
        return up[u][0];
    }

    void push(int i) {
        if (lazy[i] != 0) {
            lazy[2 * i + 1] ^= lazy[i];
            lazy[2 * i + 2] ^= lazy[i];
            lazy[i] = 0;
        }
    }

    void updateRange(int i, int l, int r, int ql, int qr, int mask) {
        if (r < ql || l > qr) return;

        if (ql <= l && r <= qr) {
            lazy[i] ^= mask;
            return;
        }

        push(i);
        int mid = l + (r - l) / 2;
        updateRange(2 * i + 1, l, mid, ql, qr, mask);
        updateRange(2 * i + 2, mid + 1, r, ql, qr, mask);
    }

    int queryPoint(int index, int i, int l, int r) {
        if (l == r) return lazy[i];

        push(i);
        int mid = l + (r - l) / 2;

        if (index <= mid) return queryPoint(index, 2 * i + 1, l, mid);
        return queryPoint(index, 2 * i + 2, mid + 1, r);
    }

    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
        this.n = n;
        char[] chars = s.toCharArray();
        adj = new HashMap<>();

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        tin = new int[n];
        tout = new int[n];
        depth = new int[n];
        parentMask = new int[n];

        log = 1;
        while ((1 << log) <= n) log++;

        up = new int[n][log];
        for (int[] row : up) Arrays.fill(row, -1);

        timer = 0;
        dfs(0, -1, 0, 0, chars);
        buildLCA();

        segTree = new int[4 * n];
        lazy = new int[4 * n];
        List<Boolean> result = new ArrayList<>();

        for (String q : queries) {
            String[] parts = q.split(" ");

            if (parts[0].equals("update")) {
                int node = Integer.parseInt(parts[1]);
                char c = parts[2].charAt(0);
                int change = (1 << (chars[node] - 'a')) ^ (1 << (c - 'a'));
                chars[node] = c;
                updateRange(0, 0, n - 1, tin[node], tout[node], change);
            } else {
                int u = Integer.parseInt(parts[1]);
                int v = Integer.parseInt(parts[2]);
                int lca = getLCA(u, v);

                int maskU = parentMask[u] ^ queryPoint(tin[u], 0, 0, n - 1);
                int maskV = parentMask[v] ^ queryPoint(tin[v], 0, 0, n - 1);
                int mask = maskU ^ maskV ^ (1 << (chars[lca] - 'a'));

                result.add((mask & (mask - 1)) == 0);
            }
        }
        return result;
    }
}