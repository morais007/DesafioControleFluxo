import java.util.Scanner;
import java.util.Locale;
import java.io.*;


public class Contador {
	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
        
		System.out.println("Digite o primeiro parâmetro");

		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");

		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (Exception e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws  ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois){
            throw new ArithmeticException ();
        }
        
         else{
            int contagem = parametroDois - parametroUm;
            for(int i = 0; i < contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
         }   
        
        
            
		//realizar o for para imprimir os números com base na variável contagem
	}

    public class ParametrosInvalidosException extends Exception {
    
        
    }
}