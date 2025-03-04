class Solution {
    public int fib(int n) {
        ArrayList<Integer> fibNums = new ArrayList<>();
        fibNums.add(0);
        fibNums.add(1);

        for (int i = 2; i <= n; i++) {
            fibNums.add(i, fibNums.get(i - 1) + fibNums.get(i - 2));
        }

        return fibNums.get(n);
    }
}