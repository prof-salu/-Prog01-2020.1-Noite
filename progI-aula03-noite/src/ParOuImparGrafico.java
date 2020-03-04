
import javax.swing.JOptionPane;


public class ParOuImparGrafico {
    public static void main(String[] args) {
        
        int numero;
        JOptionPane.showMessageDialog(null,"Jogo do par ou impar");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        
        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "Par");
        }else{
            JOptionPane.showMessageDialog(null, "Impar");
        }
    }
}
