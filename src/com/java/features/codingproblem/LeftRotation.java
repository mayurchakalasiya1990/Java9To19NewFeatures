package com.java.features.codingproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        List<Integer> arr = List.of(665765,772707,84598,111935);
        //System.out.println(rotRight(arr,6));
        System.out.println(rotLeft(arr,2));
        //System.out.println(6%6);
    }
    public static List<Integer> rotRight(List<Integer> a, int d) {
        // Write your code here
        List<Integer> result=new ArrayList<>(Arrays.asList(new Integer[a.size()]));
        System.out.println(result.size());
        for (int i = 0; i < a.size(); i++) {
            System.out.println(result);
            if(i+d < a.size()){

                System.out.println("1:"+(i+d));
                result.set(i+d,a.get(i));
            }else{
                System.out.println("2:"+((i+d)%(a.size())));
                result.set((i+d)%(a.size()),a.get(i));
            }
        }

        return result;
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List<Integer> result=new ArrayList<>(Arrays.asList(new Integer[a.size()]));
        System.out.println(result.size());
        for (int i = a.size()-1; i >=0; i--) {
            System.out.println(result);
            if(i-d >= 0){
                System.out.println("1:"+(i-d));
                result.set(i-d,a.get(i));
            }else{
                System.out.println("2:"+(a.size()-1-i));
                result.set(a.size()-1-i,a.get(i));
            }
        }

        return result;
    }

}
