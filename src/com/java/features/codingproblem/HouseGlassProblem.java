package com.java.features.codingproblem;

import java.util.List;

public class HouseGlassProblem {
    public static void main(String[] args) {
        int[][] arr ={
                {-9,-9,-9, 1, 1, 1},
                {0,-9,0,4,3,2},
                {-9,-9,-9,1,2,3},
                {0,0,8,6,6,0},
                {0,0,0,-2,0,0},
                {0,0,1,2,4,0}
        };

        List<List<Integer>> arrL = List.of(
                List.of(-9,-9,-9, 1, 1, 1),
                List.of(0,-9,0,4,3,2),
                List.of(-9,-9,-9,1,2,3),
                List.of(0,0,8,6,6,0),
                List.of(0,0,0,-2,0,0),
                List.of(0,0,1,2,4,0)

        );
        System.out.println(arr.length+":"+arr[0].length);
        System.out.println(arrL.size()+":"+arrL.get(0).size());
        hourglassSum(arrL);
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int hourglassSum=0;
        int max=-1;
        boolean first=true;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (arr.size() < 6 || arr.get(i).size()<6)
                    return Integer.MAX_VALUE;

                if((i+2 < arr.size()) && (j+2 < arr.get(i).size())){
                    hourglassSum = (arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2))
                            +(arr.get(i+1).get(j+1))
                            +(arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2));
                    System.out.println(hourglassSum);
                }
                if(first){
                    max=hourglassSum;
                    first=false;
                }else if(max < hourglassSum){
                    max =hourglassSum;
                }
            }
        }
        System.out.println("Output: "+max);
        return max;
    }

    public static int hourglassSum(int[][] arr) {
        // Write your code here
        int hourglassSum=0;
        int max=-1;
        boolean first=true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //System.out.println(i+" "+j);
                if((i+2 < arr.length) && (j+2 < arr[i].length)){
                    hourglassSum = (arr[i][j]+arr[i][j+1]+arr[i][j+2])
                                +(arr[i+1][j+1])
                                +(arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
                    System.out.println(hourglassSum);
                }
                if(first){
                    max=hourglassSum;
                    first=false;
                }else if(max < hourglassSum){
                    max =hourglassSum;
                }
            }
        }
        System.out.println("Output: "+max);

        return max;
    }
}
