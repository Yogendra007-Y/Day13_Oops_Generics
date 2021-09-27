package com.bridgelabz;

public class FindMaxValue {

    /**
     * Method used to compare three integer values and get the maximum value.
     * a1 : First value to compare
     * a2 : Second value to compare
     * a3 : Third value to compare
     * @return max : Maximum of three integers
     */

    public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3){
        Integer max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }

    public static Float maxOfFloat(Float f1, Float f2, Float f3) {
        Float max = f1;
        if (f2.compareTo(max) > 0)
            max = f2;
        if (f3.compareTo(max) > 0)
            max = f3;
        return max;
    }
    public static String maxOfString(String s1, String s2, String s3) {
        String max = s1;
        if (s2.compareTo(max) > 0)
            max = s2;
        if (s3.compareTo(max) > 0)
            max = s3;
        return max;
    }


    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximum Problem Using Generics \n");
        System.out.println("The maximum value between the three integer is : " + maxOfInteger(10, 20, 5));
        System.out.println("The maximum value between the three float is : " + maxOfFloat(3.87f, 7.56f, 5.987f));
        System.out.println("The maximum value between the three string is : " + maxOfString("Yogendra", "Lalit", "Sharma"));
    }
}
