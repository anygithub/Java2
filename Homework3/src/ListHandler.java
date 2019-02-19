/**
 * @author Anna Bondarenko
 * @version 19.02.19
 */
import java.util.*;


public class ListHandler {

    /**
     * Generate arrayList
     * @param arrayList
     */
    public void generateList(List<String> arrayList) {
        arrayList.add("apple");
        arrayList.add("pineapple");
        arrayList.add("banana");
        arrayList.add("grape");
        arrayList.add("plum");
        arrayList.add("melon");
        arrayList.add("strawberry");
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("grape");
        arrayList.add("grape");
        arrayList.add("pineapple");
        arrayList.add("melon");
        arrayList.add("melon");
        arrayList.add("pear");
    }

    /**
     * Get list of unique words from the list
     * @param list
     * @return
     */
    public Set<String> getListOfUniqueWords(List<String> list) {
        Set<String> set = new HashSet<>();
        for (String s:list) {
           set.add(s);
        }
        return set;
    }

    public void printCountOfUniqueWords(List<String> list, Set<String> set) {
        for (String s:set) {
            System.out.println(s + "  " + Collections.frequency(list, s));
        }
    }


}
