import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Anna Bondarenko
 * @version 19.02.19
 */


public class AppLauncher {
    
    public static void main(String[] args) {
        runExercise1();
    }

    /* Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
       Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
       Посчитать сколько раз встречается каждое слово. */
    public static void runExercise1() {
        List<String> arrayList = new ArrayList<>();
        ListHandler listHandler = new ListHandler();
        Set<String> hashSet;

        //generate list of strings
        listHandler.generateList(arrayList);
        System.out.println(arrayList);

        //get the list of unique words
        hashSet = listHandler.getListOfUniqueWords(arrayList);
        System.out.println(hashSet);

        // get count for each unique word
        listHandler.printCountOfUniqueWords(arrayList,hashSet);
    }



}
