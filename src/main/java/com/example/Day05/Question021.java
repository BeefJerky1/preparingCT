package com.example.Day05;

import java.util.ArrayList;
import java.util.List;

public class Question021 {
    public static void main(String[] args) {
        /**
         * 마지막 두 원소
         * 문제 설명
         * 정수 리스트 num_list가 주어질 때,
         * 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가
         * 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
         */
        int [] numList = new int[]{2,1,6};
        List<Integer> result =  solution(numList);
        System.out.println(result);
    }

    public static List<Integer>  solution(int[] num_list) {
        int lastItem = num_list[num_list.length-1];
        int secondLastItem = num_list[num_list.length-2];
        int result = lastItem > secondLastItem ?  (lastItem - secondLastItem) : lastItem * 2;
        List<Integer> newList = new ArrayList<>();
        for (int i : num_list) {
            newList.add(i);
        }
        newList.add(result);
        return newList;
    }
    /**
     * 다른 사람의 문제풀이
     * 기존의 배열이 아니라 새로운 int 배열을 더 크게 설정해서 만듬
     */
    public int[] solution2(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }

        answer[num_list.length] = num_list[num_list.length-1] > num_list[num_list.length-2] ? num_list[num_list.length-1]-num_list[num_list.length-2]:num_list[num_list.length-1]*2;
        return answer;
    }
}
