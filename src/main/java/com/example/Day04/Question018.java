package com.example.Day04;

public class Question018 {
    public static void main(String[] args) {
        /**
         * 주사위게임2
         * 문제 설명
         * 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
         *
         * 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
         * 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
         * 세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
         * 세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
         */
        int a = 4;
        int b = 4;
        int c = 4;
        int r = solution(a, b, c);
    }
    public static int solution(int a, int b, int c) {
        boolean allDifferent = (a != b) && (b != c) && (a != c);
        boolean allSame = (a == b) && (b == c) && (a == c);
        int answer = 0;
        if(allDifferent){
            answer=  a + b + c;
        }else if(allSame){
            answer=  (a + b + c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)) * (int)(Math.pow(a,3)+Math.pow(b,3) + Math.pow(c,3));
        }else{
            answer= (a+b+c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        }
        return answer;
    }
}
