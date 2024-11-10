package com.example.Day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question027 {
    public static void main(String[] args) {
        /**
         * 배열만들기2
         * 문제 설명
         * 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
         *
         * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
         */
        int i = 5;
        int j = 555;
        int[] answer = solution(i, j);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int i, int j) {
        List<Integer> answer = new ArrayList<>();
        for (int k = i; k <= j; k++) {
            String asdf = String.valueOf(k);
            for (int l = 0; l < asdf.toCharArray().length; l++) {
                if (asdf.charAt(l) == '5' || asdf.charAt(l) == '0') {
                    if (l == asdf.toCharArray().length - 1) {
                        answer.add(k);
                    }
                } else {
                    break;
                }
            }
        }
        if (answer.size() == 0) {
            answer.add(-1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 다른 사람 문제풀이
     * 이진법을 이용한 풀이 잘 ㅣ
     */
    public static int[] solution2(int l, int r) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        return list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(i -> i).toArray();
    }

}
