package uke3.Oppgave3;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
    
    
    List<Integer> mListliste = new ArrayList<>(java.util.Arrays.asList(1, 2, 2, 4, 5));

        

        System.out.println(mListliste.get(3));
        System.out.println(mListliste.get(4));

        System.out.println(mListliste.size());


        System.out.println(mListliste.size());

        mListliste.add(3, 3);

        System.out.println(mListliste.contains(7));

        mListliste.clear();

        System.out.println(mListliste.size());


        


    }


}
