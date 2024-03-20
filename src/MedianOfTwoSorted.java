import java.util.Arrays;

public class MedianOfTwoSorted {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] merged = Arrays.copyOf(nums1, m+n); //merging two arrays
        System.arraycopy(nums2,0,merged,m,n); //merging the second array

        Arrays.sort(merged); //sorting the array

        return getMiddleElement(merged);
    }

    public static double getMiddleElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int middleIndex = arr.length / 2;
        if (arr.length % 2 == 0) {
            // If it's even, we find both of the middle elements
            return (arr[middleIndex - 1] + arr[middleIndex]) / 2.00000;
        } else {
            // If it's odd, we find only one middle element
            return arr[middleIndex];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};
        MedianOfTwoSorted medianOfTwoSorted = new MedianOfTwoSorted();
        double res = medianOfTwoSorted.findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }
}
