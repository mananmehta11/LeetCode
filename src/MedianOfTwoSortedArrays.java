/*
* Median of Two Sorted Arrays
* Given two sorted arrays nums1 and nums2 of size m and n respectively,
* return the median of the two sorted arrays.
* The overall run time complexity should be O(log (m+n)).
* https://leetcode.com/problems/median-of-two-sorted-arrays/description/
* */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int medianIndex = totalLength/2 + 1;
        int medianCounter = 0;
        int median = 0;
        int prev = 0;
        int counter1 = 0;
        int counter2 = 0;
        while (medianIndex!=medianCounter){
            prev = median;
            if(counter1>=nums1.length){
                median = nums2[counter2];
                counter2++;
            }
            else if(counter2>=nums2.length){
                median = nums1[counter1];
                counter1++;
            }
            else if( nums1[counter1]<nums2[counter2]) {
                median = nums1[counter1];
                counter1++;
            }
            else {
                median = nums2[counter2];
                counter2++;
            }
            medianCounter++;

        }
        if (totalLength%2==0) return (prev+median)/2d;
        return median;
    }
}
