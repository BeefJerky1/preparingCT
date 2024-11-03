package com.example.Day05;

import java.util.*;

public class Question025 {
    public static void main(String[] args) {
        /**
         * 수열과 구간 쿼리 2
         * 문제 설명
         * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
         *
         * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
         *
         * 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
         * 단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
         */
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        int[] answer = solution(arr, queries);
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int standard = queries[i][2];
            List<Integer> newList = new ArrayList<>();
            // 리스트 생성해서 시작부터 종료까지 기준이 되는 숫자보다 큰 숫자를 모두 담는다.
            // 큰 숫자가 없다면 -1을 넣고 종료
            for (int j = start; j <= end; j++) {
                if(arr[j]>standard){
                    newList.add(arr[j]);
                }else{
                    answer[i] = -1;
                }
            }
            // 기준이 되는 숫자보다 큰 숫자가 담긴 리스트가 있다면 0번째를 min을 빼놓고 그보다 작은 숫자가 있을때마다 담는다.
            // 가장 작은 숫자가 answer에 담겨서 return 된다.
            if(newList.size()>0){
                int min = newList.get(0);
                for (Integer integer : newList) {
                    if(integer<min){
                        min = integer;
                    }
                }
                answer[i] = min;
            }
        }
        return answer;
    }
    /**
     *  다른 사람들의 문제풀이
     *  Arrays.fill 이라는 함수를 사용해서 기준이 되는 숫자보다 큰 숫자가 없다면 -1을 자동을 넣도록 함
     *  Math.min을 사용하여 그때그때 가장 작은 숫자를 담아 넣었다. 더 간결해짐
     */
    public int[] solution2(int[] arr, int[][] queries) {

        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);

        for (int idx = 0; idx < queries.length; idx++) {
            int[] query = queries[idx];
            int s = query[0], e = query[1], k = query[2];

            for (int i = s; i <= e; i++) {
                if (k < arr[i]) {
                    answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
                }
            }

        }

        return answer;
    }
}
