package com.geekbrains.maxta.junit2;

public class MainApp {
    public static void main(String[] args) {

    }
        public static boolean arrayOnlyOnesAndFours(int[] arr) {
            boolean i1 = false, i4 = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) i1 = true;
                else if (arr[i] == 4) i4 = true;
                else return false;
            }
            return i1 && i4;
        }
    }

