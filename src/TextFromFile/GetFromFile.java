package TextFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class GetFromFile {
    public static void main(String[] args) {
        listOfWordsFromFile("C:\\Users\\diana\\Desktop\\Дорога.txt");
    }

    public static void listOfWordsFromFile(String filepath) {
        Map<String, Integer> wordList = new TreeMap<>();
        String text = readTextFile(filepath);
               String[] words = text.trim().split("\\s+");

        for (String word : words) {
            if (!wordList.containsKey(word)) wordList.put(word, 1);
            else wordList.put(word, wordList.get(word) + 1);
        }
        System.out.println("Сколько раз встречается слово в тексте:");
        String key = null;
        int value = 0;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordList.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value > maxCount) maxCount = value;
            System.out.println(String.format("'%s' - %d раз(а)", key, value));
        }
        for (Map.Entry<String, Integer> entry : wordList.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value == maxCount)
                System.out.println(String.format("\nСлово '%s' больше всего повторяется в файле - %d раз(а)", key, value));
        }
    }

    public static String readTextFile(String filepath) {
        File file = new File(filepath);
        String text = null;
        try (FileReader reader = new FileReader(file)) {
            char[] s = new char[256];
            int c;
            while ((c = reader.read(s)) > 0) {
                if (c < 256) {
                    s = Arrays.copyOf(s, c);
                }
            }
            text = String.valueOf(s);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}