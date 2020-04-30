
public class Cliente extends Usuario implements IUsuario{
	private String ranking;
	
	public String getRanking() {
		return this.ranking;
	}
	
	public void setRanking(String ranking) {
		this.ranking = ranking;
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
