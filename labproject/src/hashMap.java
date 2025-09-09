import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence and this is a test sentence";
        String[] words = sentence.toLowerCase().split("\\s+");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}