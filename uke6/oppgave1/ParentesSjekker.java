package uke6.oppgave1;
import java.util.ArrayList;



public class ParentesSjekker implements StabelADT<Character> {

    private ArrayList<Character> stabel;

    public boolean sjekk(String a){
        for(char c : a.toCharArray()){
            if (startParentes(c)) {
                push(c); 
            } else if (sluttParentes(c)){
                if (isEmpty() || !par(pop(), c )) {
                    return false; 
                }
            }
        }
        return isEmpty(); 
    }

    public boolean startParentes(char c){
        return c == '(' || c == '{' || c == '[';
    }

    public boolean sluttParentes(char c){
        return c == ')' || c == '}' || c == ']';
    }

    public boolean par(char start, char slutt){
        return (start == '(' && slutt == ')') ||
               (start == '{' &&  slutt == '}') ||
               (start == '[' &&  slutt == ']');   

    }
    
    @Override
    public void push(Character newEntry) {
        stabel.add(newEntry);
    }
    
    @Override
    public Character pop() {
        if (!isEmpty()) {
            return stabel.remove(stabel.size() - 1);
        }
        return null;
    }
    
    @Override
    public Character peek() {
        if (!isEmpty()) {
            return stabel.get(stabel.size() - 1);
        }
        return null;
    }
    
    @Override
    public boolean isEmpty() {
        return stabel.isEmpty();
    }
    
    @Override
    public void clear() {
        stabel.clear();
    }
}



