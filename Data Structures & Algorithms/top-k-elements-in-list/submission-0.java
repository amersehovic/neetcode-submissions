class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        int[] result = new int[k];

        //count all the numbers and how often they appear
        for(int count : nums) {
            int currentNumber = counter.getOrDefault(count, 0);
            counter.put(count, currentNumber + 1);
        }

        for(int i = 0; i < k; i++) {
            int commonNumber = -1;
            int commonFrequency = -1;

            for(Map.Entry<Integer, Integer> entry : counter.entrySet()) {
                if(entry.getValue() > commonFrequency){
                    commonFrequency = entry.getValue();
                    commonNumber = entry.getKey();
                }
            }
            result[i] = commonNumber;
            counter.remove(commonNumber);
        }

        return result;
    }
}
