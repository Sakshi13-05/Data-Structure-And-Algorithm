import java.util.*;

class TopKFrequentElements {
    public static void top(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            bucket[frequency].add(number);
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = bucket.length - 1; i >= 0 && answer.size() < k; i--) {

            for (int num : bucket[i]) {

                answer.add(num);

                if (answer.size() == k)
                    break;
            }
        }
        System.out.println(answer);
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3, 4, 4 };
        top(nums, 2);
    }
}