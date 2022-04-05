class Solution{
    public int maxWater(int[] height){

        int i = 0;
        int j = height.length - 1;
        
        int water = 0;

        while(i < j){
            int width = j - i;
            int height = Math.min(height[i], height[j]);

            int newWater = height * width;
            
            water = Math.max(water, newWater);


            if(height[i] < height[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return water;
    }
}