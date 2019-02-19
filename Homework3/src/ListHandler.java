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
        try {
            if (list.size() == 0) {
                throw new IllegalArgumentException("Empty list");
            }
            Set<String> set = new HashSet<>();
            for (String s:list) {
                set.add(s);
            }
            return set;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }catch (NullPointerException npe) {
            npe.printStackTrace();
            return null;
        }
    }

    /**
     * Print word and how many times it appears in the list
     * @param list initial list where search will be ran
     * @param set list of unique words from the list
     */
    public void printCountOfUniqueWords(List<String> list, Set<String> set) {
        try {
            if (list.size() == 0 || set.size() == 0) {
                throw new IllegalArgumentException("Empty list");
            }
            for (String s:set) {
                System.out.println(s + "  " + Collections.frequency(list, s));
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }
    }

}
