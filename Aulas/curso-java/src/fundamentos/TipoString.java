package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(7));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		
		String nome = "Vinicius", sobrenome = "Silvano";
		int idade = 22;
		float salario = 12345.947f;
		
		System.out.printf("O nome dele é %s %s, tem %d anos e recebe R$%.2f", nome, sobrenome, idade, salario);
		System.out.println("\n" + salario);
		System.out.format("\n" + "%.2f", salario);
		
		s = String.format("SALÁRIO: %.2f", salario);
		System.out.println("\n" + s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Teste fora de contexto
		System.out.println("\n\n");
		String linhas = "Olá";
		String nomes = "Vinícius";
		String comps = "OLÁ VINICIUS";
		int tamanho;
		//boolean teste;
		linhas = linhas.toUpperCase().concat(" " + nomes.toUpperCase());
		System.out.println(linhas);
		
		System.out.println("Equal ignore case: " + linhas.equalsIgnoreCase(comps));
		
		tamanho = linhas.length();
		System.out.println(tamanho);
		
		System.out.println(linhas.charAt(1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
