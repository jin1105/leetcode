import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by gaojin on 2017/4/25.
 */
public class Sum3 {
    public static void main(String[] args){
        
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0;i < nums.length;i++){
            if(nums[i] > 0)break;
            if(i > 0 && nums[i] == nums[i-1])continue;
            int target = 0 - nums[i];
            int k = i + 1, j = nums.length - 1;
            while (k < j){
                if(nums[k] + nums[j] == target){
                    res.add(Arrays.asList(nums[i],nums[k],nums[j]));
                    while (k < j && nums[k] == nums[k+1])k++;
                    while (k < j && nums[j] == nums[j-1])j--;
                    ++k;--j;
                }else if (nums[k] + nums[j] < target)k++;
                else j--;
            }
        }
        return res;
    }
}
