
public class Cliente implements Autenticavel{
	private String login;
	private String senha;	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean autentica(String login, String senha) {
		return this.login.equals(login) && this.senha.equals(senha);
	}
}
