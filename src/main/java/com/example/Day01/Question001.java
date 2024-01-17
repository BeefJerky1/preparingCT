package com.example.Day01;

import java.util.Scanner;

public class Question001 {
    public static void main(String[] args) {
        //덧셈식 출력하기
        //두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(a + "+" + b +"="+ c);
    }
}
