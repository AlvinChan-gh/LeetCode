class Solution {
    public int removeDuplicates(int[] nums) {
        int next = 0;
        if(nums.length > 0){
            next= 1;
            for(int i = 1; i < nums.length ; i++){
                if(nums[i] > nums [next-1]){
                    if (next != i) {
                        nums[next] = nums[i];
                    }
                    next++;
                    System.out.println(i +" and " +next);
                }
            }
        }
        return next;
    }
}