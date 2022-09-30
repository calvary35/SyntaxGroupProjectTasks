public class Task3 {
    public static void main(String[] args) {

        // Create a 2D array of integer values. Print the sum of all numbers.

        int[][] arr = { { 38, 27, 97, 48, 308, 27 }, { 287, 498, 364, 987, 28 } };
        int sum = 0;
        for (int[]ar:arr){
            for(int num:ar) {
                sum+=num;

            }
        }
        System.out.println(sum);
    }
}

