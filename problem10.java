//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

class problem10 {

    public double solution(int[] numbers) {
        double sum = 0;
        int len = numbers.length;

        for (int i = 0; i < len; i++) {
            sum = sum + numbers[i];

        }
        return sum / len;
    }
}
