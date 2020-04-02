
public class Cliente {
	//Variaveis globais
	private String cpf;
	private String nome;
	private String email;
	private static int totalClientes = 0;
	
	public Cliente() {
		//Construtor vazio
		Cliente.totalClientes++;
	}
	
	//Sobrecarga de construtores
	public Cliente(String cpf, String nome, String email) {
		//Construtor cheio
		//variaveis locais
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		totalClientes++;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public static int getTotalClientes() {
		return Cliente.totalClientes;
	}
}
