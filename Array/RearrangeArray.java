package Array;
import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {

    public static int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < positive.size(); i++) {
            result[index++] = positive.get(i); 
            result[index++] = negative.get(i); 
        }

        return result;
    }

 
}

