/*프로그래머스 모바일은 개인정보 보호를 위해 고지서를 
보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 
전화번호의 뒷 4자리를 제외한 나머지 숫자를 
전부 *으로 가린 문자열을 리턴하는 함수, 
solution을 완성해주세요. */

class problem27 {
    public String solution(String phone_number) {
        int length = phone_number.length();

        // 뒷 4자리를 제외한 부분을 *로 치환 , "문자열",repeat(반복할 횟수)
        String masked = "*".repeat(length - 4);

        // 뒷 4자리 가져오기
        String lastFour = phone_number.substring(length - 4);

        return masked + lastFour;
    }
}