import java.util.*;

/**
 * Aug 22 Streak: Big Data Simulation
 * Concept: MapReduce Word Count (Map Phase)
 * Logic: Simulates the frequency mapping of keys in a large dataset.
 */
public class WordCountAlgo {
    public static void main(String[] args) {
        // Mock dataset (Simulating unstructured data)
        String inputData = "kafka springboot kafka postgresql springboot kafka bigdata docker kafka";

        // Splitting (Simulating the tokenization/shuffling phase)
        String[] tokens = inputData.split(" ");

        // Frequency Map (The Resulting Map Phase)
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String token : tokens) {
            frequencyMap.put(token, frequencyMap.getOrDefault(token, 0) + 1);
        }

        // Displaying results
        System.out.println("--- MapReduce: Word Frequency Results ---");
        frequencyMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}