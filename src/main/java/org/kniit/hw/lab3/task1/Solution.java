package org.kniit.hw.lab3.task1;

public class Solution {
    public void duplicateZeros(int[] arr) {
        if (arr == null || arr.length == 0){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i++;
            }
        }
    }
}