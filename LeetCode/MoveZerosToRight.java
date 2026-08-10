public class MoveZerosToRight {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 3, 0, 2 };
        int read = 0, write = 0, n = arr.length, count = 0;
        while (read < n) {
            if (arr[read] != 0) {
                arr[write] = arr[read];
                write++;
                read++;
            } else {
                // Write a single zero to represent the continuous block
                arr[write] = 0;
                write++;

                // Skip all the remaining continuous zeros
                while (read < n && arr[read] == 0) {
                    read++;
                }
            }
        }
        while (write < n) {
            arr[write++] = 0;
        }

        // nhi valid only right chalo

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
