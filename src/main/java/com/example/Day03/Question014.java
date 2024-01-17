package com.example.Day03;

public class Question014 {
    public static void main(String[] args) {
        int solution = solution(">", "!", 41, 78);
        System.out.println("solution = " + solution);
    }
    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals("<") && eq.equals("=")){
            answer =  n <= m ? 1 : 0;
        }else if(ineq.equals(">") && eq.equals("=")){
            answer = n >= m ? 1 : 0;
        }else if(ineq.equals(">") && eq.equals("!")){
            answer = n > m ? 1 : 0;
        }else if(ineq.equals("<") && eq.equals("!")){
            answer = n < m ? 1 : 0;
        }
        return answer;
    }
}
