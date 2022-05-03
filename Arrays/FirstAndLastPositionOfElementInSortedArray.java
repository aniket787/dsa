class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];

        result[0] = firstIndex(nums, target);
        result[1] = lastIndex(nums, target);

        return result;
    }

    public static int firstIndex(int[] nums, int target) {

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                index = mid;
                right = mid - 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            }

            else if (target > nums[mid]) {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return index;
    }

    public static int lastIndex(int[] nums, int target) {

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                index = mid;
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            }

            else if (target > nums[mid]) {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return index;
    }
}