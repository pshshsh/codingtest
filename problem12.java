//문제:정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요

class Solution {

    public double solution(int[] numbers) {
        double sum = 0;
        int len = numbers.length;

        for (int i = 0; i < len; i++) {
            sum = sum + numbers[i];
        }

        return sum / len;
    }
}
