import java.util.ArrayList;

public class ListaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("pedro");
		Pessoa p2 = new Pessoa("antonio");
		Pessoa p3 = new Pessoa("jose");
		
		ArrayList lista = new ArrayList();
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add("mario");
		lista.add(45);
		
		//lista.get(2).getNome();
		
		for(int i = 0; i < lista.size(); i++) {
			Pessoa pessoa = (Pessoa) lista.get(i);
			System.out.println(pessoa.getNome());
		}
	}

}
