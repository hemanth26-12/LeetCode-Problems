import java.util.*;
class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int list1[] = new int[nums1.length + nums2.length];
        System.arraycopy(nums1,0,list1,0,nums1.length);
        System.arraycopy(nums2,0,list1,nums1.length,nums2.length);
        Arrays.sort(list1);
        int n = list1.length;
        if(n%2==1){
            return list1[n/2];
        }
        else{
            return (list1[(n/2)-1]+ list1[n/2]) /2.0;
        }


    }
}