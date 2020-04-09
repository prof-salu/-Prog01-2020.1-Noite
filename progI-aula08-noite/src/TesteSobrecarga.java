
public class TesteSobrecarga {

	public static void main(String[] args) {
		MetodosSobrecarregados ms = new MetodosSobrecarregados();
		
		System.out.println(ms.soma(4, 4));
		System.out.println(ms.soma(4.5f, 3.2f));
		System.out.println(ms.multiplicar(4, 3.2f));


	}

}
