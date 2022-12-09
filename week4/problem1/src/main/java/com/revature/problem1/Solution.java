package com.revature.problem1;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        int current = k;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element > current) {
                if (element == current + 1) {
                    current = element;
                }
            }
        }
        return current + 1;
    }
}
