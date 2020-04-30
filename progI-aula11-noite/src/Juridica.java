
public class Juridica extends Pessoa{
	private String cnpj;
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public boolean validarDocumento() {
		return false;
	}
}
