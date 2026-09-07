import java.util.HashSet;

public class ContainsDuplicates {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,3,4};
        System.out.println(containsDuplicate(nums));

    }
}