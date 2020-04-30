
public class Fisica extends Pessoa{
	private String cpf;
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public boolean validarDocumento() {
		return false;
	}
}
