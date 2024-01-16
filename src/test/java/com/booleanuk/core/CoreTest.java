package com.booleanuk.core;

import com.booleanuk.RandomStudent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoreTest {

    @Test
    public void testMenu(){
        RandomStudent random = new RandomStudent();
        String expected = """
                Choose option:
                1. Pick random student
                2. Pick random pairs
                3. Pick random groups
                4. Exit
                """;
        Assertions.assertEquals(expected, random.showMenu());

    }

    @Test
    public void testToGetRandomStudents(){
        RandomStudent randomStudent = new RandomStudent();
        randomStudent.random.setSeed(120);

        Assertions.assertEquals("Sander Sather", randomStudent.getRandomStudent());
        Assertions.assertEquals("Lars Kvifte", randomStudent.getRandomStudent());
        Assertions.assertEquals("Lars Kvifte", randomStudent.getRandomStudent());
        Assertions.assertEquals("Markus Moe", randomStudent.getRandomStudent());

    }

}
