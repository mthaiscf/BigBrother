
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		int entrada = 0;
		int saida = 0;
				
		System.out.println("\nDigite um numero inteiro : \n");
		Scanner ler = new Scanner(System.in);
		entrada = ler.nextInt();
		ler.close();
		
		Numero n = new Numero(entrada);
		saida = n.ObtemBigBrother();
		System.out.println("\nsaida  : " + saida + "\n\n");
		
	}

}
