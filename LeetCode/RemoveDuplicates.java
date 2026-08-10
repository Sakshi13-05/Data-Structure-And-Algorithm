
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3, 3 };
        int read = 1, write = 0, n = arr.length;
        while (read < n) {
            if (arr[read] > arr[write]) {
                write++;
                arr[write] = arr[read];

            }
            read++;
        }

        // nhi valid only right chalo

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
