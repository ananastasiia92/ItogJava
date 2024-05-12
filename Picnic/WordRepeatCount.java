package Picnic;

import java.util.HashMap;
import java.util.Map;

public class WordRepeatCount {
    private final Map<String, Integer> wordRepeat;

    public WordRepeatCount() {
        this.wordRepeat = new HashMap<>();
    }

    public void addWord(String word){
        wordRepeat.put(word, wordRepeat.getOrDefault(word, 0) + 1);
    }

    public void printWordRepeat(){
        wordRepeat.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
