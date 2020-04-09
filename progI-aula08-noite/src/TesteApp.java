
public class TesteApp {

	public static void main(String[] args) {
		AplicativoDesenho app = new AplicativoDesenho();
		
		Forma forma = new Forma();
		Forma quadrado = new Quadrado();
		Forma circulo = new Circulo();
		Forma triangulo = new Triangulo();
		
		app.desenhaForma(forma);
		app.desenhaForma(quadrado);
		app.desenhaForma(triangulo);
		app.desenhaForma(circulo);

	}

}
