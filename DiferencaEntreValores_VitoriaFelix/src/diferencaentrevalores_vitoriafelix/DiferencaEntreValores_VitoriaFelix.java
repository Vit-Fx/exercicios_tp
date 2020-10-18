package diferencaentrevalores_vitoriafelix;
import java.util.Scanner;
        
public class DiferencaEntreValores_VitoriaFelix
{
    public static void main(String[] args) 
    {
        Scanner entrada;
        double numR1,numR2,dif;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Digite um número real: ");
        numR1 = entrada.nextDouble();
        
        System.out.print("Digite outro número real: ");
        numR2 = entrada.nextDouble();
        
        dif = Math.pow(( numR1 - numR2 ), 2);
        System.out.print("A diferença do primeiro número pelo segundo é: " + dif + "\n");
        
        
    }
    
}
