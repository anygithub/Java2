import java.util.ArrayList;
import java.util.List;

/**
 * @author Anna Bondarenko
 * @version 19.02.19
 */


public class AppLauncher {



    public static void main(String[] args) {
        //generate list of strings
        List<String> arrayList = new ArrayList<>();
        ListHandler listHandler = new ListHandler();

        listHandler.generateList(arrayList);
        System.out.println(arrayList.toString());

        //sort the list
        //count

    }




}
