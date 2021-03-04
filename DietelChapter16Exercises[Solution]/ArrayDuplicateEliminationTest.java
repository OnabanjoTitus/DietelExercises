package com.cohortFive.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDuplicateEliminationTest {
    ArrayDuplicateElimination arrayDuplicateElimination;

    @BeforeEach
    void setUp() {
        arrayDuplicateElimination=new ArrayDuplicateElimination();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatWordsCanBeEnteredAndDuplicatesCanBeEliminatedUsingArrays(){
        String [] words={"Titus","Damilola","Titus","Damola","Titus"};
      arrayDuplicateElimination.setWords(words);
      assertEquals(arrayDuplicateElimination.getArray()[2],words[3]);
    }
    @Test
    void testThatWordsCanBeEnteredAndDuplicatesCanBeEliminatedUsingSets(){
        String [] words={"Titus","Damilola","Titus","Damola","Titus"};
        arrayDuplicateElimination.setWordsSets(Arrays.asList(words));
        Set<String> firstNameSets= arrayDuplicateElimination.getSet();
        Iterator<String> names= firstNameSets.iterator();

        while (names.hasNext()){
            System.out.println(names.next());
        }

    }
    @Test
    void testForCountingLetters(){
    String word="Hello There";


    }
    }

