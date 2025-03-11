/**
 * @author Saahi Venkatraghavan
 */
public class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] numbers = new int[m+n];
            int numLength = 0;


            for (int first = 0; first < m; first++) {
                for (int second = 0; second < n; second++) {
                    if (nums1[first] < nums2[second] & numLength < numbers.length) {
                        numbers[numLength] = nums1[first];
                    } else {
                        numbers[numLength] = nums2[second];
                    }
                }
                numLength++;
            }

            for (int i = 0; i < numbers.length; i++) {
                nums1[i] = numbers[i];
            }
        }
    }
