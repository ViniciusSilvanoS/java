package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class P1ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
			
		System.out.println("For normal ---------------------------------->");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\nFor Each ---------------------------------->");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nIterator ---------------------------------->");
		Iterator<String> iterator = aprovados.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nStream ---------------------------------->");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // Laço interno!!!
		
	}
	
}
