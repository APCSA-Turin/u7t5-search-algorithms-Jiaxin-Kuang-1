package com.example.project.Binary_Search;
import java.lang.Math;

public class BinarySearch {
    // implements binary search on the elements list for target,
    // and returns the index at which the target is found, or -1 if
    public static int binarySearch(int[] elements, int target) {
        if(elements.length == 0){
            return -1;
        }

        int loopCounter = 0; 
        int maxLoop = (int) Math.sqrt(elements.length) + 1;
        int leftIdx = 0;  // TODO: assign this initial value
        int rightIdx = elements.length; // TODO: assign this initial value
        
        while(loopCounter < maxLoop) {  // TODO: determine this condition (hint: see slides 61-63)
            loopCounter++; 
            int middleIdx = (rightIdx + leftIdx) / 2; // TODO: determine what this should be
            System.out.println(middleIdx);
            if(elements[middleIdx] == target){
                return middleIdx;
            }
            else{
                if(elements[middleIdx] < target){
                    leftIdx = middleIdx;
                }
                else{
                    rightIdx = middleIdx;
                }
            }
        }

        //     // TODO: write the rest of the code to compare middleIdx to the target
        //     //  and adjust leftIdx and rightIdx as appropriate (see slides if needed)
        return -1; // not found
    }
}
