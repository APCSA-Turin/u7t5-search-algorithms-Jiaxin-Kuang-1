package com.example.project.Binary_Search;
import java.lang.Math;

public class BinarySearch {
    // implements binary search on the elements list for target,
    // and returns the index at which the target is found, or -1 if
    public static int binarySearch(int[] elements, int target) {
        int loop = 0; 
        int maxLoop = (int) Math.ceil(Math.log(elements.length) / Math.log(2));
        int leftIdx = 0;  
        int rightIdx = elements.length - 1; 

        if(elements.length == 1){
            if(elements[0] == target){
                return 0;
            }
        }
        
        while(loop < maxLoop){
        loop++; 
            int middleIdx = (rightIdx + leftIdx) / 2; 
            System.out.println(middleIdx);
            if(elements[middleIdx] == target){
                return middleIdx;
            }
            else{
                if(elements[middleIdx] < target){
                    leftIdx = middleIdx + 1;
                }
                else{
                    rightIdx = middleIdx - 1;
                }
            }
        }
        return -1; 
    }
}
