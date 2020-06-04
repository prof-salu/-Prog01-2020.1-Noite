import java.util.ArrayList;

public class TesteLista {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		Integer x = new Integer(3);
		
		lista.add("ana");
		lista.add("bia");
		lista.add("mara");
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		
		lista.add("gabi");
		
		System.out.println(lista.get(3));
		
		lista.remove(1);
		
		System.out.println();
		System.out.println();
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		
		lista.add(x);
		
		
		for(int i = 0; i < lista.size(); i++) {
			//System.out.println(lista.get(i));
		}
	}

}
