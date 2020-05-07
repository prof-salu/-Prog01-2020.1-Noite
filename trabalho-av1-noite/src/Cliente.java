
public abstract class Cliente implements Autentica {
	private String nome;
	private String email;
	private String senha;

	public Cliente() {

	}

	public Cliente(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

//	@Override
//	public boolean validarLogin(String email, String senha) {
//		return getEmail().equals(email) && getSenha().equals(senha);
//	}

	@Override
	public boolean validarLogin(String email, String senha) {
		if (getEmail().equals(email) && getSenha().equals(senha)) {
			return true;
		} else {
			return false;
		}
	}

}
