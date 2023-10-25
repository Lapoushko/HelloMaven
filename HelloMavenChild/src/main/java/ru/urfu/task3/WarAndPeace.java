package ru.urfu.task3;

import java.nio.file.Path;
import java.util.*;

/**
 * <p>Написать консольное приложение, которое принимает на вход произвольный текстовый файл в формате txt.
 * Нужно собрать все встречающийся слова и посчитать для каждого из них количество раз, сколько слово встретилось.
 * Морфологию не учитываем.</p>
 * <p>Вывести на экран наиболее используемые (TOP) 10 слов и наименее используемые (LAST) 10 слов</p>
 * <p>Проверить работу на романе Льва Толстого “Война и мир”</p>
 *
 * @author vpyzhyanov
 * @since 19.10.2023
 */
public class WarAndPeace {

    private static final Path WAR_AND_PEACE_FILE_PATH = Path.of("HelloMavenChild/src/main/resources/",
            "Лев_Толстой_Война_и_мир_Том_1,_2,_3,_4_(UTF-8).txt");


    //Общая сложность алгоритма - O(N + k log k)
    public static void main(String[] args) {
        List<List<Map.Entry<String,Integer>>> list = CalculateWords();
        double startTime = System.nanoTime();
        for (List<Map.Entry<String,Integer>> list1 : list) {
            for (Object o: list1) {
                System.out.print(o +"\n");
            }
            System.out.print("\n");
        }
        double time = System.nanoTime() - startTime;
        System.out.println(time); //Замер выполнения кода
    }


    //Сложность O(N)
    private static List<List<Map.Entry<String,Integer>>> CalculateWords(){
        WordParser wordParser = new WordParser(WAR_AND_PEACE_FILE_PATH);
        Map<String,Integer> hashMap = new HashMap<>(); //С помощью Map можно быстро обращаться к словам O(1)
        wordParser.forEachWord(word ->{
            if (!hashMap.containsKey(word))
                hashMap.put(word,1);
            else hashMap.put(word,hashMap.get(word) + 1);
        });
        List<List<Map.Entry<String,Integer>>> answer = new ArrayList<>();
        answer.add(CalculateTop10(hashMap,true));
        answer.add(CalculateTop10(hashMap,false));
        return answer;
    }

    //Сложность O(k log k)
    private static List<Map.Entry<String,Integer>> CalculateTop10(Map<String,Integer> hashMap, boolean isMaxTop10){
        List<Map.Entry<String,Integer>> list = new ArrayList<>(hashMap.entrySet()); //У ArrayList обращение к элементу требует O(1), поэтому подходит
        if(isMaxTop10){
            list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        }
        else {
            list.sort(Map.Entry.comparingByValue());
        }
        return list.subList(0,10);
    }

}
