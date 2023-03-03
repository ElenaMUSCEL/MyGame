package challenge;

import java.util.ArrayList;
import java.util.List;

public class Students {
    public static <Graduated> void main(String[] args) {
        List<String> studentsArrayList = new ArrayList<>();

        studentsArrayList.add("Maria");
        studentsArrayList.add("Ion");
        studentsArrayList.add("George");
        studentsArrayList.add("Andreea");
        studentsArrayList.add("Bianca");
        studentsArrayList.add("Cristina");
        studentsArrayList.add("Tudor");
        studentsArrayList.add("Alin");
        studentsArrayList.add("Stefan");
        studentsArrayList.add("Denisa");
        List<String>graduatedArrayList = new ArrayList<>();

        for(String student : studentsArrayList) {
            graduatedArrayList.add(student);
            System.out.println(graduatedArrayList);
        }
      }

}
