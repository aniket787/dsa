// for left rotate


class Solution {
    public void rotate(int[] nums, int k) {
        
        // for more rotates
        if(k > n){
            k = k % n;
        }

        // for negative

        if(k < 0){
            k = k + n;
        }

        swap(nums, 0, n - k - 1);
        swap(nums, n - k, n - 1;);
        swap(nums, 0, n - 1);
    }

    public static void swap(int[] nums, int a, int b){

        while(a < b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;

            a++;
            b--;
        }
    }
}    
  

  // for right rotate

  class Solution {
    public void rotate(int[] nums, int k) {
        
        // for more rotates
        if(k > n){
            k = k % n;
        }

        // for negative

        if(k < 0){
            k = k + n;
        }

        
        swap(nums, n - k, n - 1;);
        swap(nums, 0, n - k - 1);
        swap(nums, 0, n - 1);

    }

    public static void swap(int[] nums, int a, int b){

        while(a < b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;

            a++;
            b--;
        }
    }
}   