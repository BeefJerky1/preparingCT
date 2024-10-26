package com.example.Day04;

import java.util.Arrays;

public class Question019 {
    public static void main(String[] args) {
        /**
         * 원소들의 곱과 합
         * 문제 설명
         * 정수가 담긴 리스트 num_list가 주어질 때,
         * 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
         */
        int [] numList = new int[] {5,4,3,2,1};
        int result = solution(numList);
    }

    public static int solution(int[] num_list) {
        int multiply = 1;
        int pow = 0;
        for (int i = 0; i < num_list.length; i++) {
            pow += num_list[i];
            multiply *=num_list[i];
        }
        return multiply < (int)Math.pow(pow, 2) ?  1 : 0;
    }
 }
