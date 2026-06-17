import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {

        // Key -> Sorted String
        // Value -> List of original strings
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            // Convert string to character array
            char[] ch = word.toCharArray();

            // Sort the character array
            Arrays.sort(ch);

            // Convert back to string
            String key = new String(ch);

            // If key is not present, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the original word to the corresponding list
            map.get(key).add(word);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> result = groupAnagrams(strs);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}