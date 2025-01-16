package uke3.Oppgave7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Ola", "Nordmann", "Oslo"));
        studentList.add(new Student("Kari", "Nordmann", "Bergen"));
        studentList.add(new Student("Per", "Nordmann", "Trondheim"));
        studentList.add(new Student("Knut", "Nordmann", "Stavanger"));
        studentList.add(new Student("Kari", "Nordmann", "Bergen"));
        
        studentList.sort(null);


        System.out.println(studentList);

        



    }
    
}
