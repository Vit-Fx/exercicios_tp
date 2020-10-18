package conversaotemp_vitoriafelix;

import java.util.Scanner;

public class Conversaotemp_VitoriaFelix {
    
    public static void main(String[] args) 
    {
        Scanner entrada;
        double c,f;
        
        entrada = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        c = entrada.nextDouble();
        f = c * 1.8 + 32;
        
        System.out.println("A temperatura de em Fahrenheit é: "+ f);
        
    }
    
}
