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
        
        //Nei

        studentList.sort(null);


        System.out.println(studentList);


        ArrayList<NettStudent> nettStudentList = new ArrayList<>();

        nettStudentList.add(new NettStudent("Ola", "Nordmann", "Oslo", "Oslo"));
        nettStudentList.add(new NettStudent("Kari", "Nordmann", "Bergen", "Bergen"));
        nettStudentList.add(new NettStudent("Per", "Nordmann", "Trondheim", "Trondheim"));
        nettStudentList.add(new NettStudent("Knut", "Nordmann", "Stavanger", "Stavanger"));
        nettStudentList.add(new NettStudent("Kari", "Nordmann", "Bergen", "Bergen"));

        nettStudentList.sort(null);
        //NEi 


        for(NettStudent s : nettStudentList) {
            System.out.println(s.getStudieSted());
        }



        



    }
    
}
