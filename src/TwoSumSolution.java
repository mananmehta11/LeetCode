import java.util.*;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for(int index=0; index<nums.length; index++){
            Integer index2 = numIndexMap.get(target - nums[index]);
            if(Objects.nonNull(index2)) return new int[]{index, index2};
            numIndexMap.put(nums[index], index);
        }
        return new int[]{};
    }
}
