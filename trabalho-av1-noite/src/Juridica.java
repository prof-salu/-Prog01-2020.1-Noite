
public class Juridica extends Cliente {

	private String cnpj;

	public Juridica() {

	}

	public Juridica(String nome, String email, String senha, String cnpj) {
		super(nome, email, senha);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
