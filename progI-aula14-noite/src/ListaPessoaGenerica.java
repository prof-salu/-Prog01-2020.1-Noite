import java.util.ArrayList;

public class ListaPessoaGenerica {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("pedro");
		Pessoa p2 = new Pessoa("antonio");
		Pessoa p3 = new Pessoa("jose");
		
		ArrayList<Pessoa> lista = new ArrayList();
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		//lista.add("joao");
		
		for(int i = 0; i < lista.size(); i++) {
			//System.out.println(lista.get(i).getNome());
		}
		
		//FOREACH
		for(Pessoa pessoa : lista) {
			System.out.println(pessoa.getNome());
		}
	}
}