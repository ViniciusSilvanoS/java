package classe;

public class ValorNulo {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String s1 = "Olá";
		System.out.println(s1.concat("!!!"));
		
		String s2 = null;
		System.out.println(s2.concat("???"));
	}
	
}