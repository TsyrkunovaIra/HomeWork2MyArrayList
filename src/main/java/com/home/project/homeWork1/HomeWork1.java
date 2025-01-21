package com.home.project.homeWork1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HomeWork1 {
    public static void turnString (String string){
        char[] list = string.toCharArray();
        StringBuilder st = new StringBuilder();
        for (int i = list.length - 1; i >= 0; i--) {
            st.append(list[i]);
        }
        System.out.println(st);
    }

    public static void getDistinctNumber(int[] ints) {
        Set<Integer> set = new HashSet<>();
        for (int element : ints) {
            set.add(element);}
        System.out.println(set);
    }

    public static Integer findSecondMaxElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    public static Integer lengthOfLastWord(String string) {
        String[]strings = string.split(" ");
        String result1 = strings[strings.length-1];
        return result1.length();
    }

    public static boolean isPalindrome(String string) {
        char[] list1 = string.toCharArray();
        for (int i = 1; i < list1.length/2; i++ ) {
            if (list1[i-1] != list1[list1.length-i]) {
                return false;}
            }
        return true;
    }


    public static  void main(String[] args){
        turnString("I love Java");

        int[] ints1 = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        getDistinctNumber(ints1);

        int[] ints2 = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        System.out.println(findSecondMaxElement(ints2));

        String str1 = "Hello world";
        System.out.println(lengthOfLastWord(str1));

        String str2 = "ьльльль";
        System.out.println(isPalindrome(str2));



    }
}



