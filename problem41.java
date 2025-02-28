//문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
class problem41 {
    public String solution(String s) {
        String answer = ""; // 변수 이름을 'answer'로 일관되게 사용
        int index = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer += " ";
                index = 0; // 공백을 만나면 인덱스를 초기화
            } else {
                // 짝수 인덱스는 대문자, 홀수 인덱스는 소문자
                answer += (index % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c);
                index++;
            }
        }

        return answer;
    }
}