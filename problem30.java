/*단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다. */

class problem30 {
    public String solution(String s) {
        int length = s.length();
        int mid = length / 2;
        if (length % 2 == 0) {
            return s.substring(mid - 1, mid + 1);

        } else
            return s.substring(mid, mid + 1);
    }
}