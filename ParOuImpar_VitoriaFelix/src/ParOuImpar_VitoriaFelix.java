import java.util.Scanner;
public class ParOuImpar_VitoriaFelix 
{   
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Digite um número inteiro: ");
        num = entrada.nextInt();
        
        if(num %2==0)
        {
            System.out.println("Esse número é par!");
        }
        else
        {
            System.out.println("Esse número é impar!");
        }  
    }        
}
   
