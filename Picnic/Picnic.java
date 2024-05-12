package Picnic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Picnic {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            WordCount wordCount = new WordCount();
            FindLongestWord searchLongest = new FindLongestWord();
            WordRepeatCount wordRepeatCount = new WordRepeatCount();

            while (scanner.hasNext()) {
                String word = scanner.next();
                wordCount.countWord(word);
                searchLongest.findLongestWord(word);
                wordRepeatCount.addWord(word);
            }

            System.out.println("Общий список продуктов стостоит из " + wordCount.getTotalNumberOfWords() + " наименований.");
            System.out.println("Продукт, в котором больше всего букв: " + searchLongest.getLongestWords());
            System.out.println("Повторения продуктов в списке: ");
            wordRepeatCount.printWordRepeat();

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}