package uke3.Oppgave2;

 

public class FigurListe {
    private Figur[] figurer;

    public FigurListe(){
        figurer = new Figur[10];

    }

    public Figur generateRandomFigur(){
        int value = (int)(Math.random() * 2) + 1;
        Figur a = null;
        switch (value) {
            case 1:
                a = new Rektangel(Math.random() * 10, Math.random() * 10);
                break;
            case 2:
                a = new Trekant(Math.random() * 10);
                break;
        }
        return a; 
    }
    

    public void leggTilFigur(Figur figur){
        for(int i = 0; i < figurer.length; i++){
            if(figurer[i] == null){
                figurer[i] = figur;
                break;
            }
        }
    }
public static void main(String[] args) {
    FigurListe fl = new FigurListe();
    for(int i = 0; i < 10; i++){
        fl.leggTilFigur(fl.generateRandomFigur());
    }
    for(Figur f : fl.figurer){
        if(f != null){
            System.out.println(f.areal());
            f.tegn();
        }
    }
    double totalAreal = 0;
    for(Figur f : fl.figurer){
        if(f != null){
            totalAreal += f.areal();
        }
    }
    System.out.println("Total areal: " + totalAreal);
}

    
}
