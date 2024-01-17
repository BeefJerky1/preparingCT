package com.example.Day02;

public class Question008 {
    public static void main(String[] args) {
        //문자열 곱하기
        //문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
        String my_string = "string";
        int k = 3;
        String result = solution(my_string, k);
        System.out.println("result = " + result );
    }
    public static String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
