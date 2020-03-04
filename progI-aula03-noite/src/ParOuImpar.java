
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero;
        System.out.println("Digite um numero: ");
        
        Scanner entrada = new Scanner(System.in);
        
        numero = entrada.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
        
        entrada.close();
        
        System.out.println("numero: " + numero);
    }
}
