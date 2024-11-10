package com.example.Day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Question028 {
    public static void main(String[] args) {
        /**
         * 카운트 업
         * 문제 설명
         * 정수 start_num와 end_num가 주어질 때,
         * start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
         */
        int []  answer = solution(3,10);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            answer.add(i);

        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    /**
     * 다른 사람의 문제 풀이
     * 매우 간단해 보인다. 속도가 느리다고 한다.
     */
    public int[] solution2(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }
}
