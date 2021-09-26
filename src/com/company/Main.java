package com.company;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

    public static <T> void change(T[] arr, Predicate<T> condition, UnaryOperator<T> action) {
        for (int i = 0; i < arr.length; i++) {
            if (condition.test(arr[i]) == true) {
                arr[i] = action.apply(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        //Integer[] arr = new Integer[]{10, 8, 5, 12};
        Character[] arr = new Character[]{'a', 'b', 'c'};

        change(arr, item -> item >= 'a' && item <= 'b', item -> item = (char) ((int) item + 2));

//        for (int item : arr) {
//            System.out.println(item);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        Arrays.stream(arr).forEach(item -> System.out.println(item));
    }
}
