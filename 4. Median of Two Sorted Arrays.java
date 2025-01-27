class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int len_nums1=nums1.length;
     int len_nums2=nums2.length;
     int sum_len=len_nums1+len_nums2;
     int[] arr =new int[sum_len];
     int mid=sum_len/2;
     int i=0;
     int n1=0,n2=0;
     while(i<=mid){
        if(n1>=len_nums1){
            arr[i]=nums2[n2];
            n2++;
        }
        else if(n2>=len_nums2){
            arr[i]=nums1[n1];
            n1++;
        }
        else if(nums1[n1]<nums2[n2]){
            arr[i]=nums1[n1];
            n1++;
        }
        else{
            arr[i]=nums2[n2];
            n2++;
        }
        i++;
     }
     double sum;
     if(mid!=0 && (mid%2==0)){
        sum=(arr[mid]+arr[mid-1])/2f;
     }
     else{
        sum=(arr[mid])/2f;
     }
     return sum;
    }
}
