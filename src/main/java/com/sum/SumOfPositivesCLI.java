package com.sum;

public class SumOfPositivesCLI {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num > 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
