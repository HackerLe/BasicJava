package com.nwpu.demo0905;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arrayA = {10, 20, 30, 40, 50, 60,70, 80};
        System.out.println("反转前: ");
        for (int value : arrayA) {
            System.out.print(value + " ");
        }
        System.out.println();

        for(int min = 0, max = arrayA.length - 1; min < max; min++, max--){
            int temp = arrayA[min];
            arrayA[min] = arrayA[max];
            arrayA[max] = temp;
        }

        System.out.println("反转后: ");
        for(int value : arrayA){
            System.out.print(value + " ");
        }
        System.out.println();

    }
}
