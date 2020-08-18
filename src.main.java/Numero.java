import java.util.Arrays;

public class Numero {
	
	private int numero;
	
	
	protected Numero() {}
	
	public Numero(int numero) {
		setNumero(numero);
	}
	
	
	
	public int ObtemBigBrother() {
		
		int out = -1;
		if(this.numero > -1 && this.numero < 100000000) {			
			String numeroOrdenar = String.valueOf(this.numero);				
			char ordenarArray[] = numeroOrdenar.toCharArray();
	        Arrays.sort(ordenarArray);
	        String str = new String(Arrays.toString(ordenarArray));
	        StringBuffer sbuf = new StringBuffer(str);
	        sbuf.reverse();
	        String str2 = new String(sbuf);
	        str2 = str2.replaceAll("\\D+","");
	        out = Integer.parseInt(str2);
		}
		return out;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

}
