public class Task4 {
    public static void main(String[] args) {
		/* Create a 2D array or integer type where you will store odd and even numbers.
		Develop a program which will identify/print the even numbers only.
		*/

        int[][] arr = { { 38, 27, 97, 48, 308, 27 }, { 287, 498, 364, 987, 28 } };

        int sum=0;
        for(int[] ar:arr) {
            for(int num : ar) {
                if(num%2==0) {
                    System.out.print(num + " ");

                }

            }
        }



    }

}

