import java.util.Arrays;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        // Using Scanner create an array of integer values. After the array is created,
        // calculate the sum of all stored elements in that array

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the size of the array.");

        int size = scan.nextInt();

        int[] array = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.println("Please enter an int number");
            array[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        System.out.println("Sum of all the numbers from the Array is " + sum);

    }

}

