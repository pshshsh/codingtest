
/*array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요. */
import java.util.ArrayList;
import java.util.Collections;

class problem25 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                resultList.add(arr[i]); // 리스트에 추가가
            }
        }

        if (resultList.isEmpty()) {
            return new int[] { -1 };
        }
        // 오름차순순
        Collections.sort(resultList);

        // ArrayList를 Stream으로 변환하고 Inteer 객체를 int 기본형으로 바꾸고 int[]로 변환한다다
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
