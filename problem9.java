// 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
//제한사항 0 < n ≤ 1000

class Solution {

    public int solution(int n) {
        int sum = 0;
        if (n > 0 && n <= 1000) {
            for (int i = 0; i <= n; i = i + 2) {
                sum = sum + i;
            }
            return sum;

        }
        return 0;
    }

}
