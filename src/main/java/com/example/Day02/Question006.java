package com.example.Day02;

public class Question006 {

    public static void main(String[] args) {
        //문자열 섞기
        //문제 설명
        //길이가 같은 두 문자열 str1과 str2가 주어집니다.
        //두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String answer = solution(str1, str2);
        System.out.println("answer = " + answer);
    }
    public static String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        return sb.toString();
    };
}
