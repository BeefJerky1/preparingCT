package com.example.FirstDay;

import java.util.ArrayList;
import java.util.List;

public class Question005 {

    public static void main(String[] args) {
        //문자열 겹쳐쓰기
        /**
         * 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
         * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로
         * 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
         */
        String my_string = "He11oWor1d";
        List<Character> myString = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            myString.add(my_string.charAt(i));
        }
        String overwrite_string = "lloWorl";
        List<Character> overwriteString = new ArrayList<>();
        for (int i = 0; i < overwrite_string.length(); i++) {
            overwriteString.add(overwrite_string.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        int s = 2;
        for (int i = 0; i < myString.size(); i++) {
            if(i>=s){
                if(!overwriteString.isEmpty()){
                    result.append(overwriteString.get(0));
                    overwriteString.remove(0);
                }else{
                    result.append(myString.get(i));
                }
            }else{
                result.append(myString.get(i));
            }
        }
        System.out.println("result = " + result);

        String before = my_string.substring(0, s);
        String after = my_string.substring(s+overwrite_string.length());
        System.out.println("result2 = " + before+overwrite_string+after);
    }
}
