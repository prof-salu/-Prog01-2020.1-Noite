package lang;

import javax.swing.JOptionPane;

public class TesteWrapper {

	public static void main(String[] args) {
		Float x1 = new Float(45.34f);
		Float x3 = null;
		float x2 = 45.34f;
		
		System.out.println(x1);
		System.out.println(x2);
		
		Double numero = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
	}
}
