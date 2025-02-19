/**
 * @author Saahi Venkatraghavan
 */
public class twoSum {
    /*
    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

     */
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int length = nums.length;
            int[] answer = new int[2];

            for (int check = 0; check < length; check++) {
                for (int run = check + 1; run < length; run++) {
                    if (nums[check] + nums[run] == target) {
                        answer[0] = check;
                        answer[1] = run;
                        return answer;
                    }
                }
            }
            return answer;
        }
    }
