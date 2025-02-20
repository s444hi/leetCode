/**
 * @author Saahi Venkatraghavan
 */
public class searchInsert {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return index;
                } else {
                    for (int j = 0; j < num.length; j++) {
                        if (j <= nums[j]) {
                            return j;
                        }
                    }
                }
                index++;
            }
        }
    }
}

