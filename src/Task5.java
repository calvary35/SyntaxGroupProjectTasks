public class Task5 {
    public static void main(String[] args) {
        /*
         * Create a 2D array of integers. Develop a program which will calculate the sum
         * of even and odd numbers for that array.
         */
        int even = 0;

        int odd = 0;

        int[][] numbers = { { 23, 48, 76, 53, 21, 98 },
                { 245, 87, 65, 98, 34, 48 } };

        for(int []num:numbers) {
            for(int nums: num) {
                if(nums % 2==0) {
                    even+=nums;



                }else {
                    odd+=nums;

                }
            }
        }
        System.out.println(even + " " + odd);

    }

}

