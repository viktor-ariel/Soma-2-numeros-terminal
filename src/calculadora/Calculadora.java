package calculadora;
import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args){     
    
    Scanner leia = new Scanner(System.in);
    
    System.out.printf("CALCULADORA DE SOMA\n\n");
    
    System.out.printf("Digite um numero:\n");
    Float n1 = leia.nextFloat();


    System.out.printf("\nDigite outro numero:\n");
    Float n2 = leia.nextFloat();
    
    float resultado = (n1+n2); 
    
    System.out.println("O Resuldado é: "+ resultado);
  }
}


