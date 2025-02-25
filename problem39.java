class problem39 {
    public int[] solution(int n, int m) {
        int a = n, b = m;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        int lcm = (n * m) / gcd;
        return new int[] { gcd, lcm };
    }
}