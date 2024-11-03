package com.example.Day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question024 {
    public static void main(String[] args) {
        /**
         * 수열과 구간 쿼리 3
         * 문제 설명
         * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
         *
         * 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
         *
         * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
         */
        int [] arr ={ 0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        int [] answer = solution(arr, queries);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int j = queries[i][0];
            int k = queries[i][1];
            int temp1 = arr[j];
            int temp2 = arr[k];
            arr[j] = temp2;
            arr[k] = temp1;
        }
        return arr;
    }
}
