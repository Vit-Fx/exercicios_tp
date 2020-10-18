package calculodequatronumeros_vitoriafelix;
import java.util.Scanner;

public class CalculoDeQuatroNumeros_VitoriaFelix 
{ 
    public static void main(String[] args) 
    {
        Scanner entrada;
        double num1,num2,num3,num4,multi,soma;
    
        entrada = new Scanner(System.in);
    
        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextDouble();
    
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextDouble();
    
        System.out.println("Digite o terceiro número : ");
        num3 = entrada.nextDouble();
        
        System.out.println("Digite o quarto número: ");
        num4 = entrada.nextDouble();
        
        multi = num1 * num3;
        soma = num2 + num4;
        
        System.out.println("A multiplicação entre o primeiro número e o terceiro número é: " + multi);
        System.out.println("A soma entre o segundo número e o quarto é: " + soma);
    }
    
}
