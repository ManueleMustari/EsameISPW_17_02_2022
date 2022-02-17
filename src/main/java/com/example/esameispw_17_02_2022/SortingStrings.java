package com.example.esameispw_17_02_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SortingStrings {

    /**
     * Il programma riceve in input una lista di stringhe, le ordina, e restituisce una lista ordinata.
     * Non stampo niente su terminale per non avere code smells.
     *
     */

    public static List<String> sortStrings(List<String> list){

        //Variabili
        int i;
        int j;
        int numOfStrings;
        int smaller;

        List<String> finalList = new ArrayList<>();
        numOfStrings=list.size();

        //Creo un vettore di Strings che mi serve da support per gestire il sorting
        String [] support = new String[numOfStrings];

        //Inserisci stringhe dentro support
        for(i = 0; i< numOfStrings;i++){
            support[i] = list.get(i);
        }

        //Sorting
        for (i = 0; i<numOfStrings;i++){
            smaller = i;
            for(j = 0; j<numOfStrings;j++){
                if(support[j].equals(support[i])){
                    //Non paragono una stringa con se stessa
                    continue;
                }
                if(support[j].compareTo(support[smaller]) > 0 ){
                    smaller = j;
                    String temp = support[i];
                    support[i] = support[smaller];
                    support[smaller] = temp;
                }
            }
        }

        //Aggiungi alla lista finale
        finalList = Arrays.stream(support).toList();

        return finalList;
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Marco");
        list.add("Luca");
        list.add("Antonio");
        list.add("Paolo");
        sortStrings(list);
    }
}