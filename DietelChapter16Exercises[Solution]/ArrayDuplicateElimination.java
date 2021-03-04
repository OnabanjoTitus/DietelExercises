package com.cohortFive.tdd;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicateElimination {

    String [] firstNames;

    Set<String> firstNamesSet;

    public String[] getArray() {
        return firstNames;
    }


    public void setWords(String[] words) {

        firstNames=new String[words.length];
        fillingTheArray(words);
    }

    private void fillingTheArray(String[] words) {
        firstNames[0]=words[0];
        for(int counter=0;counter<words.length;counter++){
         for(int count=0;count<firstNames.length;count++){
           if(words[counter].equalsIgnoreCase(firstNames[count])){
               break;
           }
           if(!words[counter].equalsIgnoreCase(firstNames[count])&&firstNames[count]==null){
               firstNames[count]=words[counter];
               break;
           }
           }

         }

    }

    public void setWordsSets(List<String> listOfNames) {
        firstNamesSet= new HashSet<>(listOfNames);
    }

   public Set<String> getSet() {
        return firstNamesSet;

    }



}
