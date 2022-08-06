import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> IndexMap = new HashMap<Integer, Integer>();
        for(int i = 1; i < nums.length; i++){
            int numNeeded = target - nums[i];
            if(IndexMap.containsKey(numNeeded)){
                return new int[]{IndexMap.get(numNeeded), i};
            }
            IndexMap.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
