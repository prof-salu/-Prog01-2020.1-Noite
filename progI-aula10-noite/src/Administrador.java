
public class Administrador extends Funcionario implements Autenticavel, Imprimivel{
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
		if(this.login.equals(login) && this.senha.equals(senha)) {
			return true;
		}else {
			return false;
		}		
	}
	
	@Override
	public void imprimir() {
		System.out.println("Nome: " + getNome());
		System.out.println("Salario: " + getSalario());
	}
}
