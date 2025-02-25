//자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

import java.util.List;
import java.util.ArrayList;

class problem40 {
    public int solution(int n) {
        int answer = 0;
        List<Integer> temp = new ArrayList<>();
        // 3진법 뒤집힌 상태로 저장
        while (n > 0) {
            temp.add(n % 3);
            n = n / 3;
        }
        int size = temp.size();
        for (int i = 0; i < size; i++) {
            answer += temp.get(i) * Math.pow(3, size - 1 - i);
        }

        return answer;
    }
}