import java.util.Scanner;

public class Triangulos_VitoriaFelix 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double a, b, c;
        System.out.println("Digite o valor do lado A: ");
        a = entrada.nextDouble();
        System.out.println("Digite o valor do lado B: ");
        b = entrada.nextDouble();
        System.out.println("Digite o valor do lado C: ");
        c = entrada.nextDouble();
        
        if((a+b>c) && (a+c>b) && (b+c>a))
        {
            if((a==b) && (a==c) && (b==c))
            {        
                System.out.println("Esse triângulo é equilátero.");   
            }
            else
            {
                if ((a!=b) && (a!=c) && (b!=c))
                {    
                    System.out.println ("Esse triângulo é escaleno."); 
                }
                else
                {
                    if (((a==b) && (a!=c)) || ((a==c) && (a!=b)) || ((b==c) && (b!=a)))
                    {
                        System.out.println("Esse triângulo é isósceles.");
                    } 
                }
            }
        }
        else
        {
            System.out.println("Não é um triângulo.");
        }
    }    
}
