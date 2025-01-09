class Solution {
    public int thirdMax(int[] nums) {
        int cnt=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                cnt++;
            }
            if(cnt==2){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}