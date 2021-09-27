package com.bridgelabz;

public class FindMaxValue {

    /**
     * Method used to compare three integer values and get the maximum value.
     * a1 : First value to compare
     * a2 : Second value to compare
     * a3 : Third value to compare
     * @return max : Maximum of three integers
     */

    public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3) {
        T max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }



    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximum Problem Using Generics \n");
        System.out.println("The maximum value between the three integer is : " + maxOfValues(10, 20, 5));
        System.out.println("The maximum value between the three float is : " + maxOfValues(3.87f, 7.56f, 5.987f));
        System.out.println("The maximum value between the three string is : " + maxOfValues("Yogendra", "Lalit", "Sharma"));
    }
}
