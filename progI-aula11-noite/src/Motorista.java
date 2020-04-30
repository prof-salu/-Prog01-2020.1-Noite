
public class Motorista extends Funcionario implements IFolha{
	private double valorHora;
	private int totalHoras;
	
	public double getValorHora() {
		return this.valorHora;
	}
	
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public int getTotalHoras() {
		return this.totalHoras;
	}
	
	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}
	
	@Override
	public double calcularSalario() {
		return totalHoras * valorHora;
	}
}
