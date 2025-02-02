package uke6.test;
import java.beans.Transient;
import uke6.oppgave1.ParentesSjekker;
import org.junit.jupiter.api.BeforeEach;


public class TestParentesSjekker {

    private ParentesSjekker sjekker;
    private String test1, test2, test3, test4, test5;

    @BeforeEach
    public void setUp() {
        sjekker = new ParentesSjekker();
        test1 = "{ [ ( ) ] }";  // Gyldig
        test2 = "{ [ ( ) }";     // Ugyldig - Mangler ]
        test3 = "[ ( ) ] }";     // Ugyldig - Ekstra }
        test4 = "{ [ ( ] ) }";   // Ugyldig - Feil rekkefølge
        test5 = """
        class HelloWorld {
        public static void main(String[] args) {
        System.out.println("Hello World!");
        }
        }
        """; // Gyldig Java-program
    }

    @Test
    public void testParentesSjekker() {
        // Add test logic here
    }

}