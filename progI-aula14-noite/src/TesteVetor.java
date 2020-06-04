
public class TesteVetor {

	public static void main(String[] args) {
		String lista[] = new String[3];
		
		lista[0] = "ana";
		lista[1] = "bia";
		lista[2] = "mara";
		
		
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
		System.out.println();
		System.out.println();
		
		String lista2[] = new String[5];
		
		for(int i = 0; i < lista.length; i++) {
			lista2[i] = lista[i];
		}
		
		lista2[3] = "gabi";
		lista2[4] = "carlos";
		
		for(int i = 0; i < lista2.length; i++) {
			System.out.println(lista2[i]);
		}
	}
}