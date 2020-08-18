
import java.util.Scanner;
import java.util.Arrays;

public class Application {
	
	public static void main(String[] args) {
		
		int entrada = 0;
		int saida = 0;
		
			
		System.out.println("\nDigite um numero inteiro : \n");
		Scanner ler = new Scanner(System.in);
		entrada = ler.nextInt();
		ler.close();
				
		if(entrada > -1 && entrada < 100000000) {
			
			String numeroOrdenar = String.valueOf(entrada);				
			char ordenarArray[] = numeroOrdenar.toCharArray();
	        Arrays.sort(ordenarArray);
	        String str = new String(Arrays.toString(ordenarArray));
	        StringBuffer sbuf = new StringBuffer(str);
	        sbuf.reverse();
	        String str2 = new String(sbuf);
	        str2 = str2.replaceAll("\\D+","");
	        saida = Integer.parseInt(str2);
	        
	        System.out.println("\nsaida  : " + saida + "\n\n");
			
		} else {
			System.out.println("\n\n-1\n");
		}
	}

}
