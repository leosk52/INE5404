import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Operacao calculadora = new Operacao();
		
		Scanner sk = new Scanner(System.in);
		
		//Metodo1
		int aa=0;
		while (aa == 0){
		System.out.println("Digite um Nº não nulo");
		aa= sk.nextInt();
		}
		System.out.println(calculadora.checarPositivoNegativo(aa) );
		
		//Metodo2
		System.out.println("Digite o primeiro Nº");
		int a = sk.nextInt();
		System.out.println("Digite o segundo Nº");
		int b = sk.nextInt();
		System.out.println(calculadora.recebeESoma(a, b) );
		
		//Metodo3
		System.out.println("Digite o primeiro Nº");
		int c = sk.nextInt();
		System.out.println("Digite o segundo Nº");
		int d = sk.nextInt();
		System.out.println("Digite o terceiro Nº");
		int e = sk.nextInt();
		System.out.println(calculadora.recebeTres(c, d, e) );
		
		//Metodo4
		System.out.println("Digite os segundos");
		int f = sk.nextInt();
		calculadora.transformaHorario(f);
		
		
		
	}	 	  	 	      	      	 	     	     	   	    	 	

}
