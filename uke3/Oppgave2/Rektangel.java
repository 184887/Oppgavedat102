package uke3.Oppgave2;

public class Rektangel implements Figur {
    
    private double lengde;
    private double bredde;
    
    public Rektangel(double lengde, double bredde) {
        this.lengde = lengde;
        this.bredde = bredde;
    }
    
    public double areal() {
        return lengde * bredde;
    }
    
    public void tegn() {
        for(int i = 0; i < lengde; i++) {
            for(int j = 0; j < bredde; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Rektangel r = new Rektangel(2, 3);
        System.out.println(r.areal());
        r.tegn();
    }
}
