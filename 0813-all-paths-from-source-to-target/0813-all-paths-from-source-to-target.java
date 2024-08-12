import java.util.*;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        boolean[] vis = new boolean[graph.length];
        dfs(graph, vis, 0, "0", graph.length - 1, paths);
        return paths;
    }

    public void dfs(int[][] graph, boolean[] vis, int curr, String path, int tar, List<List<Integer>> paths) {
        if (curr == tar) {
            List<Integer> currentPath = new ArrayList<>();
            for (String s : path.split(" ")) {
                currentPath.add(Integer.parseInt(s));
            }
            paths.add(currentPath);
            return;
        }
        vis[curr] = true;
        for (int next : graph[curr]) {
            if (!vis[next]) {
                dfs(graph, vis, next, path + " " + next, tar, paths);
            }
        }
        vis[curr] = false;
    }
}
