package com.example.Day03;

public class Question011 {
    public static void main(String[] args) {
        //n의 배수
        //정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
        int solution = solution(4, 2);
        System.out.println("solution = " + solution);
    }
    public static int solution(int num, int n) {
        return (num % n ==0 ? 1 : 0);
    }
}
