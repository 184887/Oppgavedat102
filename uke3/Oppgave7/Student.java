package uke3.Oppgave7;





class Student implements Comparable<Student> {

    private static int idCounter = 0;
    private int StudentID; 
    private String fornavn;
    private String etternavn;
    private String studieSted; 

    public Student(String fornavn, String etternavn, String studieSted) {
        this.StudentID = ++idCounter;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.studieSted = studieSted;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getStudieSted() {
        return studieSted;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setStudieSted(String studieSted) {
        this.studieSted = studieSted;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }


    @Override
    public int compareTo(Student o) {
        return this.studieSted.compareTo(o.studieSted);
    }

    @Override
    public String toString() {
        return "StudentID: " + StudentID + " Fornavn: " + fornavn + " Etternavn: " + etternavn + " StudieSted: " + studieSted;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fornavn == null) ? 0 : fornavn.hashCode());
        result = prime * result + ((etternavn == null) ? 0 : etternavn.hashCode());
        result = prime * result + ((studieSted == null) ? 0 : studieSted.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (fornavn == null) {
            if (other.fornavn != null)
                return false;
        } else if (!fornavn.equals(other.fornavn))
            return false;
        if (etternavn == null) {
            if (other.etternavn != null)
                return false;
        } else if (!etternavn.equals(other.etternavn))
            return false;
        if (studieSted == null) {
            if (other.studieSted != null)
                return false;
        } else if (!studieSted.equals(other.studieSted))
            return false;
        return true;
    }
    




}