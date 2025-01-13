/*0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

 */

class problem28 {
    public int solution(int[] numbers) {
        int answer = 0;

        // 1부터 9까지 모든 숫자 확인
        for (int i = 1; i <= 9; i++) {
            boolean found = false;

            // 배열 numbers에서 현재 숫자 i가 있는지 확인
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                answer += i;
            }
        }

        return answer;
    }
}
