package uke3.Oppgave2;

public class Trekant implements Figur {
   private double sideLengde; 
    
    public Trekant(double sideLengde) {
        this.sideLengde = sideLengde;
    }

    public double areal() {
        return Math.pow(sideLengde, 2) / 2;
    }

    public void tegn() {
       for(int i = 1; i < sideLengde + 1; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Trekant t = new Trekant(3);
        System.out.println(t.areal());
        t.tegn();
    }

    
}