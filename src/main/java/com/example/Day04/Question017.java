package com.example.Day04;

import java.util.stream.IntStream;

public class Question017 {
    public static void main(String[] args) {
        /**
         * 등차수열의 특정한 항만 더하기
         * 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 
         * 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
         */

        int a = 7;
        int b = 1;
        boolean [] included = new boolean[]{false, false, false, true, false, false, false	};
        int result = extracted(a, b, included);
        System.out.println(result);
    }

    private static int extracted(int a, int b , boolean [] included) {
        int result = 0;
        for (int i = 0; i < included.length; i++) {
            if(included[i]){
                result += a +(i* b);
            }
        }
        return result;
    }
    /**
     * 다른 사람 코드 비교
     * ㄴ stream 을 사용해서 한줄로도 코드 작성 가능
     * ㄴ intStream.range(0, included.length) -> 0 ~ length 까지
     */
    public int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
    }
}
