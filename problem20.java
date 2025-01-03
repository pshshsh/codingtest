// 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.


import java.util.*;
class problem20 {
    public long solution(long n) {
        List<Integer> list = new ArrayList<>();
       while (n>0){
           list.add((int)(n%10));
           n = n/10;
       }
        list.sort(Comparator.reverseOrder());  //리스트 내림차순으로 정렬하는거
            long result = 0;
        
        for (int i = 0; i < list.size(); i++) {
            result = result * 10 + list.get(i); // 숫자를 이어붙임
        }

        return result;
    }
}
