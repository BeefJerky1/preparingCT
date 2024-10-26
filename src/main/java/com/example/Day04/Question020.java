package com.example.Day04;

public class Question020 {
    public static void main(String[] args) {
        /**
         * 이어붙인 수
         * 문제 설명
         * 정수가 담긴 리스트 num_list가 주어집니다.
         * num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
         */
        int [] numList = new int[]{1,2,3,4,5};
        int result = solution (numList);
        System.out.println(result);
    }
    public static int solution(int[] num_list) {
        String even ="";
        String odd = "";
        for (int i : num_list) {
            even += i % 2 == 0 ? String.valueOf(i): "";
            odd += i % 2 == 1 ? String.valueOf(i) : "";
        }
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
