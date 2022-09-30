public class Task11 {
    public static void main(String[] args) {
        // Write a program to print out duplicate elements from an Array of Strings?

        String[] build = {"James", "Hello", "football", "Kevin", "Kevin"};

        for (int i = 0; i < build.length - 1; i++) {
            for (int j = i + 1; j < build.length; j++) {
                if ((build[i].equals(build[j])) && (i != j)) {
                    System.out.println("Duplicate Element is : " + build[j]);

                }

            }
        }
    }
}

