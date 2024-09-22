class Solution {

    public int minReorder(int n, int[][] connections) {
        List<Integer>[] adjList = new List[n];

        for(int i = 0; i < n; i++) {
            adjList[i] = new LinkedList<>();
        }

        for(var edge : connections) {
            adjList[edge[0]].add(edge[1] + 1);
            adjList[edge[1]].add(-edge[0] - 1);
        }

        return dfs(adjList, 0, -1);
    }

    private int dfs(List<Integer>[] adjList, int vertex, int prev) {
        int result = 0;

        for(int neighbor : adjList[vertex]) {
            if(Math.abs(neighbor) - 1 == prev) {
                continue;
            }

            if(neighbor > 0) {
                result++;
            }

            else {
                neighbor *= -1;
            }

            result += dfs(adjList, neighbor - 1, vertex);
        }

        return result;
    }
}