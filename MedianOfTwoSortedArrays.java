public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        // int[] nums1 = new int[] { 2, 3, 6, 15 };
        // int[] nums2 = new int[] { 1, 3, 4, 7, 10, 12 };

        int[] nums1 = new int[] { 1, 2, 3 };
        int[] nums2 = new int[] { 1, 2, 2 };

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        if (nums1.length == 0) {
            int len = nums2.length;
            if (len % 2 == 0)
                return (nums2[len / 2 - 1] + nums2[len / 2]) / 2.0;
            else
                return nums2[len / 2];
        }

        int totalLength = nums1.length + nums2.length;
        int requiredElements = totalLength / 2 + 1;
        int n1 = nums1.length == 1 ? 1 : nums1.length / 2;
        int n2 = requiredElements - n1;

        while (n1 >= 0 && n1 <= nums1.length) {
            int l1 = n1 == 0 ? Integer.MIN_VALUE : nums1[n1 - 1];
            int r1 = n1 == nums1.length ? Integer.MAX_VALUE : nums1[n1];
            int l2 = n2 == 0 ? Integer.MIN_VALUE : nums2[n2 - 1];
            int r2 = n2 == nums2.length ? Integer.MAX_VALUE : nums2[n2];

            if (l1 <= r2 && l2 <= r1) {
                if (totalLength % 2 == 0) {
                    if (n1 >= 2 && l2 < nums1[n1 - 2])
                        l2 = nums1[n1 - 2];
                    return (l1 + l2) / 2.0;
                } else
                    return Math.max(l1, l2);
            }

            if (l1 > r2)
                n1 = n1 - 1;
            else
                n1 = n1 + 1;
            n2 = requiredElements - n1;
        }
        return 0;
    }

}