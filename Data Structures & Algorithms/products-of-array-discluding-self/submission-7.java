class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int mul = 1, zeroCount = 0;

        for(int num : nums) {
            if(num != 0) {
                mul *= num;
            }
            else {
                zeroCount++;
            }
        }

        if(zeroCount > 1) {
            return output;
        }

        for(int i = 0; i < nums.length; i++) {
            if(zeroCount > 0) {
                output[i] = (nums[i] == 0) ? mul : 0;
            }
            else {
                output[i] = mul / nums[i];
            }
        }

        return output;
    }
}  
