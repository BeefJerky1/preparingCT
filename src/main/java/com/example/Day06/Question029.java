package com.example.Day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Question029 {
    public static void main(String[] args) {
        /**
         * 콜라츠 수열 만들기
         * 문제 설명
         * 모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고, x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.
         *
         * 그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.
         *
         * 계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.
         *
         * 임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때 초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.
         */
        int [] answer = solution(10);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        while(n!=1){
            if(n %2 ==0){
                n = n/2;
                answer.add(n);
            }else{
                n = 3*n+1;
                answer.add(n);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    /**
     * 다른 사람의 문제풀이
     * IntStream.iterate 은 무한 스트림을 생성하는 메서드로 첫번째 인자는 시작값을 설정 두번째 인자는 종료값을 설정한다.
     * 핵심은 IntStream.iterate를 사용하여 콜라츠 수열을 생성하고, IntStream.concat으로 수열 끝에 1을 추가하는 방식이다.
     */
    public int[] solution2(int n) {
        return IntStream.concat(
                        IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : i * 3 + 1),
                        IntStream.of(1))
                .toArray();
    }
}
