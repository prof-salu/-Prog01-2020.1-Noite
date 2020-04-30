
public class TestaUsuario {

	public static void main(String[] args) {
		Administrador a1 = new Administrador();
		
		a1.setLogin("carlos123");
		a1.setSenha("senha");
		
		System.out.println(a1.validarLogin("carlos123", "abcde"));
		System.out.println(a1.validarLogin("123carlos", "senha"));
		System.out.println(a1.validarLogin("carlos123", "senha"));
	}

}
