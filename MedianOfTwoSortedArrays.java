public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        // int[] nums1 = new int[] { 2, 3, 6, 15 };
        // int[] nums2 = new int[] { 1, 3, 4, 7, 10, 12 };

        // int[] nums1 = new int[] { 1, 2, 2 };
        // int[] nums2 = new int[] { 1, 2, 3 };

        // int[] nums1 = new int[] { 3 };
        // int[] nums2 = new int[] { -2, -1 };

        int[] nums1 = new int[] { 2 };
        int[] nums2 = new int[] { 1, 3 };

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
        int n1 = nums1.length;
        int n2 = nums2.length;
        int low = 0;
        int high = n1;
        int req = (n1 + n2 + 1) / 2;

        while (low <= high) {

            int cut1 = (low + high) / 2;
            int cut2 = req - cut1;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int r1 = cut1 == nums1.length ? Integer.MAX_VALUE : nums1[cut1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int r2 = cut2 == nums2.length ? Integer.MAX_VALUE : nums2[cut2];

            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else
                    return Math.max(l1, l2);
            }

            if (l1 > r2)
                high = cut1 - 1;
            else
                low = cut1 + 1;
        }
        return 0;
    }

}