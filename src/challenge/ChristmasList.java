package challenge;

import java.util.ArrayList;
import java.util.List;

public class ChristmasList {
    public static void main(String[] args) {
        List<String> christmasBagArrayList= new ArrayList<>();
        christmasBagArrayList.add("presents");
        christmasBagArrayList.add("Christmas decorations");
        christmasBagArrayList.add("Christmas tree");
        christmasBagArrayList.add("Christmas food");
        for(String christmas:christmasBagArrayList){
            System.out.println(christmasBagArrayList);
        }

    }
}
