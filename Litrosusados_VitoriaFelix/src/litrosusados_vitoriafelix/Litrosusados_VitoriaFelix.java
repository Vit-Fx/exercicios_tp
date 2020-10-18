package litrosusados_vitoriafelix;
import java.util.Scanner;

public class Litrosusados_VitoriaFelix 
{ 
    public static void main(String[] args) 
    {
        Scanner entrada;
        double vel,litrosusados,temp;
            
       entrada = new Scanner(System.in);
       
       System.out.println("Digite o tempo gasto: ");
       temp = entrada.nextInt();
       
       System.out.println("Digite a velocidade média durante a viagem: ");
       vel = entrada.nextDouble();

       litrosusados = (temp*vel)/12;
       System.out.println("A quantidade de litros usados: "+ litrosusados);
    }
    
}
