package Controller;

public class PalavrasContrarias {
	public PalavrasContrarias() {
		super();
	}
	
	public String PalavrasInvertidas(int tamanho, String palavra) {
		if (tamanho == 0) {
			return "";
		} else {
			return palavra.substring(tamanho - 1, tamanho) + PalavrasInvertidas(tamanho - 1, palavra);
		}
	}
}
