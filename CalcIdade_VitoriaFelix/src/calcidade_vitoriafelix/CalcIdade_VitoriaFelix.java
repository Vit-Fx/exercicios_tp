package calcidade_vitoriafelix;
import java.util.Scanner;

public class CalcIdade_VitoriaFelix 
{ 
    public static void main(String[] args) 
    {
        Scanner entrada;
        int anoNasc,anoCor,id;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Digite o ano de nascimento: ");
        anoNasc = entrada.nextInt();
        
        System.out.print("Digite o ano corrente: ");
        anoCor = entrada.nextInt();
        
        id = anoCor - anoNasc;
        System.out.print("A idade é: " + id + "\n");
    }
    
}
