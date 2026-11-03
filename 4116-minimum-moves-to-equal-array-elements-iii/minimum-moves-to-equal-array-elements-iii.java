class Solution {
    public int minMoves(int[] nums) {
      int max=nums[0];
      int count=0;
      for(int num:nums){
        if(num>max){
            max=num;
        }
      }
      for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            count+=nums[i]-max;
        }else{
            count+=max-nums[i];
        }
      }
      return count;
    
    }
}