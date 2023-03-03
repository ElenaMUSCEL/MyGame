package class9;

import java.util.ArrayList;
import java.util.List;

public class PracticeWhitList {

    public static void main(String[] args) {

        PracticeWhitList.practiceWhitArray();
        PracticeWhitList.parcticeWhitArrayListOperations();
        PracticeWhitList.practiceWhitMultidimensionalArray();
    }

    private static void practiceWhitArray(){
        int[] numberList = new int[5];
        //am declarat size {0,0,0,0,0}
        numberList[3] = 24;
        for(int number : numberList){
            System.out.println(number);
        }
        int [] anotherList = {2,3,7,5,9};
        for(int number : numberList){
            System.out.println(number);
        }
    }
    private static void practiceWhitMultidimensionalArray(){
        String [][] names = {{ "Ioana", "Maria", "Andreea"}, {"George", "Alin", "Andrei"}};
                System.out.println( names [0][0]);
    }

    private static void parcticeWhitArrayListOperations(){
        List<String> names = new ArrayList<>();
        names.add("Ioana");
        names.add("Maria");
        for(String name : names){
            System.out.println(names);
        }
    }
}
