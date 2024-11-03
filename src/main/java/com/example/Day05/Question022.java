package com.example.Day05;

public class Question022 {
    public static void main(String[] args) {
        /**
         * 수 조작하기 1
         * 문제 설명
         * 정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
         *
         * "w" : n이 1 커집니다.
         * "s" : n이 1 작아집니다.
         * "d" : n이 10 커집니다.
         * "a" : n이 10 작아집니다.
         * 위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
         */
        int number = 0;
        String control = "wsdawsdassw";
        int answer = solution(number, control);
    }
    public static int solution(int n, String control) {
        for (int i = 0; i < control.toCharArray().length; i++) {
            if(String.valueOf(control.charAt(i)).equals("w")){
                n +=1;
            }else if(String.valueOf(control.charAt(i)).equals("s")){
                n -=1;
            }else if(String.valueOf(control.charAt(i)).equals("d")){
                n +=10;
            }else if(String.valueOf(control.charAt(i)).equals("a")){
                n -=10;
            }
        }
        return n;
    }
    /**
     * 다른 사람의 풀이
     * switch 문을 사용해서 가독성이 더 좋음
     */
    public int solution2(int n, String control) {
        int answer = n;

        for(char ch : control.toCharArray()) {
            switch(ch) {
                case 'w': answer += 1; break;
                case 's': answer -= 1; break;
                case 'd': answer += 10; break;
                case 'a': answer -= 10; break;
                default:break;
            }
        }

        return answer;
    }
}