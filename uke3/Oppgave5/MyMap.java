package uke3.Oppgave5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MyMap {

    public static void main(String[] args) {

      List<String> list = new ArrayList<>(java.util.Arrays.asList("er", "det", "alle", "er", "det", "det"));
      
      java.util.Map<String, Integer> map = new HashMap<>();

      map = new HashMap<>();


      for(String s : list) {
        if(map.containsKey(s)) {
          map.put(s, map.get(s) + 1);
        } else {
          map.put(s, 1);
        }
      }

      for(String s : map.keySet()) {
        System.out.println(s + " : " + map.get(s));
      }
    }



    
    
}
