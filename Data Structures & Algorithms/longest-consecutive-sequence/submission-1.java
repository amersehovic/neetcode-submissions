class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        List<Integer> startingNums = new ArrayList<>();

        for(int n : set) {
            if(!set.contains(n - 1)) {
                startingNums.add(n);
            }
        }

        int seq = 1;
        int currentNumber = 0;

        for(int n : startingNums) {
            currentNumber = n;
            int currentSeq = 1;

            while(set.contains(currentNumber + 1)){
                currentSeq++;
                currentNumber++;
            }

            if(currentSeq > seq) {
                seq = currentSeq;
            }
        }

        return seq;
    }
}
