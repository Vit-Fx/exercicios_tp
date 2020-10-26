import java.util.Scanner;
public class CalculoEquacao_VitoriaFelix 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        System.out.println("Digite o valor de A: ");
        a = entrada.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = entrada.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = entrada.nextDouble();
        
        if (a!=0)
        {
            delta= Math.pow(b,2)-(4*a*c);
            
            if (delta>0)
            {
                x1=((-b)+Math.sqrt(delta))/(2*a);
                x2=((-b)-Math.sqrt(delta))/(2*a);
                System.out.println("O resultado de X1 é: " + x1);
                System.out.println("O resultado de X2 é: " + x2); 
            }
            else
            {
                if (delta==0)
                {
                    x1=((-b)+Math.sqrt(delta))/(2*a);
                    System.out.println("O resultado de X1 é: " + x1);
                }
                else
                {
                    if (delta<0)
                    {
                        System.out.println("A equação não possui resultados reais.");
                    }
                }
            }
            
        }
        else
        {
            System.out.println("Não foi possível calcular a equação.");
        }
    }
}
