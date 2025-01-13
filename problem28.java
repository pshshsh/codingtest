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
