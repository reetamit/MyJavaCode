class PerfectSquere {
    public static void main(String[] args) {
        int n=12;
        int sqrtN = (int) Math.sqrt(n);
        System.out.println("SqrtN"+sqrtN);
        int[] squares = new int [sqrtN];
        for (int i = 1; i <= sqrtN; i++) {
            squares[i - 1] = i * i;
            System.out.println(squares[i-1]);
        }
        int[] dp = new int [n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = n + 1;
            for (int j = 0; j < squares.length; j++) {
                if (i < squares[j]) {
                    continue;
                }
                if (squares[j] == i) {
                    dp[i] = 1;
                    continue;
                } else {
                    dp[i] = Math.min(dp[i], 1 + dp[i - squares[j]]);
                }
            }
        }
        System.out.println(dp[n]);
    }
}