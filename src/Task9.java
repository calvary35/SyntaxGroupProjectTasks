public class Task9 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?


        int[][] arr = {
                {25, 89, 780, 1047},
                {7021, 2, 52140, 24}
        };
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("The largest value in the array is " + max);
        System.out.println("The smallest value in the array is " + min);

    }


}
