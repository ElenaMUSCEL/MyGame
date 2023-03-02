package challenge;

import java.util.ArrayList;
import java.util.List;

public class Students {
    public static void main(String[] args) {
        ArrayList student = new ArrayList();
        student.add("Maria");
        student.add("Ion");
        student.add("George");
        student.add("Andreea");
        student.add("Bianca");
        student.add("Cristina");
        student.add("Tudor");
        student.add("Alin");
        student.add("Stefan");
        student.add("Denisa");
        ArrayList graduateStudent = new ArrayList();
        graduateStudent.addAll(student);
        System.out.println(graduateStudent);

        }
    }
