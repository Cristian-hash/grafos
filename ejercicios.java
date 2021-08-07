package GRAFO;

public class ejercicios {

	public static void main(String args[]) {
		Grafo<String> g = new Grafo<String>(6);
		g.insert("a");
		g.insert("b");
		g.insert("c");
		g.insert("d");
		g.insert("e");
		g.arista("a", "b", 1);
		g.arista("a", "d", 11);
		g.arista("a", "e", 11);
		g.arista("b", "c", 7);
		g.arista("c", "d", 13);
		g.arista("e", "b", 12);
		System.out.println(g.imp());
		
		
		Grafo<String> f = new Grafo<String>(11);

		String words[] = { "words", "cords", "corps", "coops", "crops", "drops", "drips", "grips", "gripe", "grape","graph" };

		for (int i = 0; i < words.length; i++) {
			f.insert(words[i]);
			if (i > 0)
				f.arista(words[i - 1], words[i]);
		}
		System.out.println(f.imp());

	}
	
	
}
