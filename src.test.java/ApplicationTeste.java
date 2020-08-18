
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ApplicationTeste {
	
	@Test
    public void testeA() {
		
		Numero teste = new Numero();

        // Testes de valores :
		teste.setNumero(909);
        assertEquals(990, teste.ObtemBigBrother());
        //System.out.println(teste.ObtemBigBrother());
        
        teste.setNumero(879);
        assertEquals(987, teste.ObtemBigBrother());
        
        teste.setNumero(123);
        assertEquals(321, teste.ObtemBigBrother());
        
        teste.setNumero(345609);
        assertEquals(965430, teste.ObtemBigBrother());
        
        teste.setNumero(102);
        assertEquals(210, teste.ObtemBigBrother());
        
        teste.setNumero(1009);
        assertEquals(9100, teste.ObtemBigBrother());
        
        teste.setNumero(200006);
        assertEquals(620000, teste.ObtemBigBrother());
        
        teste.setNumero(-1);
        assertEquals(-1, teste.ObtemBigBrother());
        
        teste.setNumero(100000000);
        assertEquals(-1, teste.ObtemBigBrother());
        
        teste.setNumero(1);
        assertEquals(1, teste.ObtemBigBrother());
        
    }

}
