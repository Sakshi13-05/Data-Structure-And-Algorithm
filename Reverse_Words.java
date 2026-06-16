public class Reverse_Words {
    public static void main(String[] args) {
        String s = "hello";

            String[] arr = s.trim().split("\\s+");

            int left = 0, right = arr.length - 1;

            while (left < right) {
                String temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
            String result = String.join(" ", arr);

            System.out.println(result);

    }
}
