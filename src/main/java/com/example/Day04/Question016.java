package com.example.Day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question016 {
    public static void main(String[] args) {
        /**
         * 코드 처리하기
         * 문제 설명
         * 문자열 code가 주어집니다.
         * code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
         *
         * mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
         *
         * mode가 0일 때
         * code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
         * code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
         * mode가 1일 때
         * code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
         * code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
         * 문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.
         *
         * 단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.
         */
        String code = "abc1abc1abc";
        String result = getResult(code);
        System.out.println(result);
    }

    private static String getResult(String code) {
        List<String> codeList = code.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.toList());
        String mode = "0";
        String result = "";
        for (int i = 0; i <= codeList.size()-1; i++) {
            if (mode.equals("0")) {
                if (!codeList.get(i).equals("1")) {
                    if( i % 2 ==0){
                        result += codeList.get(i);
                    }
                } else {
                    mode = "1";
                }
            } else {
                if (!codeList.get(i).equals("1")) {
                    if(i % 2 == 1){
                        result += codeList.get(i);
                    }
                } else {
                    mode = "0";
                }
            }

        }
        return result.equals("") ? "EMPTY" : result;
    }
    /**
     * 다른 사람의 코드를 보고 느낀점
     * ㄴ mode와 i % 2의 값이 같이 가는것을 잘 보고 코드를 단순화함
     * ㄴ 1이 아니라면 홀수이든 짝수이든 글자는 계속해서 더해주고 있었음 -> 공통된 부분을 더 생각해봐야겠음
     */
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(current);
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}
