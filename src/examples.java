public class examples {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7};
        System.out.println(firstLast6(nums));

    }

    public static boolean firstLast6(int[] nums) {

        if ((nums[0] == 6) || nums[nums.length - 1] == 6) {
            return true;
        }
            return false;

    }
}





