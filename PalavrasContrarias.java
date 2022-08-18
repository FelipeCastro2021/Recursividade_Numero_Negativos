public class PalavrasContrarias {
	public static void main(String[] args) {
		Controller.PalavrasContrarias contrario = new Controller.PalavrasContrarias();
		
		String palavra = "Ryan";
		int tamanho = palavra.length();
		
		System.out.println(contrario.PalavrasInvertidas(tamanho, palavra));
	}
}
