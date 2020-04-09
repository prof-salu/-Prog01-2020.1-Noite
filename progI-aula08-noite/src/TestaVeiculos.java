
public class TestaVeiculos {

	public static void main(String[] args) {
		//final utilizado em propriedades/variaveis passam a ser CONSTANTES
		final int X = 10;
		//x = 15;
		//x = 12;
		
		Veiculo v1 = new Veiculo();
		v1.motor = "Fux 2000";
		v1.cor = "verde";
		v1.modelo = "ZYZ1";
		v1.marca = "MNP12";
		v1.ligar();
		v1.locomover("Nublado");
		v1.imprimir();
		System.out.println();
		
		Carro c1 = new Carro();
		c1.cor = "Vermelho";
		c1.marca = "Ferrari";
		c1.modelo = "F3500";
		c1.setPlaca("ABC-1234");
		c1.motor = "BMW 3000";
		c1.ligar();
		c1.passarMarcha();
		c1.locomover("Chuva");
		c1.imprimir();
		System.out.println();
		
			
		Aviao a1 = new Aviao();
		a1.cor = "Azul";
		a1.setFabricante("Boing");
		a1.marca = "Novo 2000";
		a1.modelo = "VX4500";
		a1.setPrefixo("QT4000");
		a1.motor = "Falcon 2500";
		a1.ligar();
		a1.ativarTremDePouso();
		a1.locomover("Sol");
		//a1.locomover("teste 123");
		a1.imprimir();
		System.out.println();
		
		System.out.println(v1.toString());
		System.out.println(c1.toString());
		System.out.println(a1.toString());
	}
}
