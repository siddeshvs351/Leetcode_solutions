class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=(long)nums[i]*nums[i];
        }
        Arrays.sort(arr);
        long Leftsum=0;
        for(int i=0;i<arr.length/2;i++){
            Leftsum+=arr[i];
        }
        long Rightsum=0;
        for(int i=arr.length/2;i<arr.length;i++){
                Rightsum+=arr[i];
        }
        return Rightsum-Leftsum;
    }
}