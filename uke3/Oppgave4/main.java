package uke3.Oppgave4;

import java.util.Set;
import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>(); 
        set1.add("Hello");
        set1.add("world"); 
        
        Set<String> set2 = new HashSet<String>();

        set2.add("Hello");
        set2.add("Norway");

        Set<String> union = new HashSet<String>(set1);
        union.addAll(set2);

      
        for (String s : set1) {
            System.out.println(s);
        }


        System.out.println();

        for (String s : set2) {
            System.out.println(s);
        }

        System.out.println();

        for (String s : union) {
            System.out.println(s);
        }


        





    
    }
}

