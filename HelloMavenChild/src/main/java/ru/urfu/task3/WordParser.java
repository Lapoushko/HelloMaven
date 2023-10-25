package ru.urfu.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * Парсит слова из тестового файла<br>
 * Используйте метод {@link #forEachWord(Consumer)}<br>
 * Пример:<br>
 * <pre>
 * new WordParser(filePath)
 *     .forEachWord(word -> {
 *         // ваше действие над word
 *     });
 * </pre>
 *
 * @author vpyzhyanov
 * @since 19.10.2023
 */
public class WordParser {
    private final Path filePath;

    public WordParser(Path filePath) {
        this.filePath = filePath;
    }

    /**
     * Для каждого слова выполнить указанное действие
     */
    public void forEachWord(Consumer<String> consumer) {
        try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
            reader.lines()
                    .flatMap(line -> Arrays.stream(parse(line))
                            .filter(word -> word.length() > 2)
                            .map(String::toLowerCase))
                    .forEach(consumer);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения файла", e);
        }
    }

    private String[] parse(String line) {
        return line.split("[^A-Za-zА-Яа-я]+");
    }
}
