public class Task10 {
    public static void main(String[] args) {
        // Write a java program to find the second largest number in the array?

        int[] nums = {380, 234567, 123456, 1237658, 56179, 435679, 7433};
        int max = nums[0];
        int secondMax = nums[0];
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                temp = max;
                max = nums[i];
            }
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > temp && nums[j] < max) {
                    secondMax = nums[j];
                }
            }

        }

        System.out.print(max + " " + secondMax);
    }

}
