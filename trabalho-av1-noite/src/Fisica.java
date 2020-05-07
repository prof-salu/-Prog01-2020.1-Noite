
public class Fisica extends Cliente {
	private String cpf;

	public Fisica() {

	}

	public Fisica(String nome, String email, String senha, String cpf) {
		super(nome, email, senha);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}