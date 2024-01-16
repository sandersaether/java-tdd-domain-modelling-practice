package com.booleanuk;

import java.util.ArrayList;
import java.util.Random;

public class RandomStudent {
    public ArrayList <String> studentList = new ArrayList<>();
    public Random random;

    public RandomStudent(){
        this.random= new Random();
        studentList.add("Sander Sather");
        studentList.add("Lars Kvifte");
        studentList.add("Markus Moe");
    }


    public String showMenu(){
        return """
                Choose option:
                1. Pick random student
                2. Pick random pairs
                3. Pick random groups
                4. Exit
                """;
    }
    public String getRandomStudent(){
        return studentList.get(random.nextInt(studentList.size()));
    }
}
