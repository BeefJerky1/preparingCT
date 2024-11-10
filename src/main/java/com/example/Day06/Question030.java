package com.example.Day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Question030 {
    public static void main(String[] args) {
        /**
         * 배열 만들기 4
         * 문제 설명
         * 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
         *
         * 변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
         *
         * 만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
         * stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
         * stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
         * 위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.
         */
        int[] arr = {1, 4, 2, 5, 3};
        int[] answer = solution(arr);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else {
                if (stk.get(stk.size() - 1) < arr[i]) {
                    stk.add(arr[i]);
                    i++;
                }else{
                    stk.remove(stk.size() - 1);
                }
            }
        }
        return stk.stream().mapToInt(j -> j).toArray();
    }
    /**
     * 다른 사람의 문제풀이
     * stack 은 Last in First Out 구조로 마지막에 들어간 원소를 처리하기 매우 적합함
     * List 에서 특정 인덱스 값을 삽입하거나 제거하는 것은 상대적으로 비용이 더 많이 들 수 있음.
     * stack.empty() -> 스택이 비어있는지 확인 비었다면 true를 반환
     * stack.peek() -> 가장 마지막 원소를 반환하지만 제거되지는 않음
     * stack.push(arr[i]) -> 마지막 원소를 추가하는 메소드
     * stack.pop() -> 가장 마지막 원소를 제거하고 반환하는 메소드
     */
    public Stack<Integer> solution2(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stack.empty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else if (stack.peek() >= arr[i]) {
                stack.pop();
            }
        }
        return stack;
    }
}
