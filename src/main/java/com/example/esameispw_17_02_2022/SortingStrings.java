package com.example.esameispw_17_02_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingStrings {

    /**
     * Avviato il programma, bisognerà prima inserire sul terminale il numero di stringhe di cui si vuole fare il sort,
     * in seguito andranno inserite tante stringhe da terminale quanto era il numero precedentemente inserito,
     * ed infine il metodo sort() le ordinerà e le inserirà in una List<String>
     *
     * Non stampo niente su terminale per non avere code smells
     *
     */

    public static List<String> sortStrings(){

        //Variabili
        int i, j;
        int numOfStrings;
        int smaller;

        List<String> finalList = new ArrayList<>();

        //Inserisci da terminale il numero di stringhe che si vuole ordinare
        Scanner ts = new Scanner(System.in);
        numOfStrings = ts.nextInt();

        //Creo un vettore, che contiene numOfStrings stringhe, che mi serve da support per gestire il sorting
        String [] support = new String[numOfStrings];

        //Inserisci tante stringhe quanto è il valore di numOfStrings
        for(i = 0; i<numOfStrings;i++){
            support[i] = ts.next();
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

        //Aggiungi alla lista
        for(i = 0;i<numOfStrings;i++){
            finalList.add(support[i]);
        }

        return finalList;
    }


    public static void main(String[] args) {
        sortStrings();
    }
}