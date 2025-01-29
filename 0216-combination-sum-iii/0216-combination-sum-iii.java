class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, new ArrayList<Integer>(), k, n, result);  
        return result;
    }

    public void backtrack(int start, List<Integer> path, int k, int n, List<List<Integer>> result) {
        if (k == 0 && n == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (i > n) {
                break;
            }
            path.add(i);
            backtrack(i + 1, path, k - 1, n - i, result);
            path.remove(path.size() - 1);
        }
    }
}
