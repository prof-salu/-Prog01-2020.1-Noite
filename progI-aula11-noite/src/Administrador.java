
public class Administrador extends Usuario implements IUsuario{
	private String matricula;
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public boolean validarLogin(String login, String senha) {
		if(getLogin().equals(login) && getSenha().equals(senha)) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
