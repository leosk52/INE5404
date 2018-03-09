import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		
		Assistente adm = new Administrativo("Roger Freitas de Carvalho", 123456, 7500, 17100529);
		Assistente tec = new Tecnico("Valdir Augusto Fonseca de Calcuta", 654321, 750, 16206390);

		adm.exibeDados();
		tec.exibeDados();
		
		//////////////
		Ingresso ing = new Ingresso();
		
		System.out.println("Digite 1 p/ normal e 2 p/ VIP: ");
		int x = reader.nextInt();
		
		if (x == 1) {
		
			Normal ticket = new Normal();
			ticket.ingressoNormal();
		}
		else if (x == 2){
			System.out.println("Digite 1 p/ CS 2 p/ CI.");
			x = reader.nextInt();
			if(x == 1) {
				CamaroteSuperior ticket = new CamaroteSuperior();
				System.out.println("CAMAROTE SUPERIOR");
				ing.ingresso = ticket.retorneValorIng();
				
			}
			else {
				VIP ticket = new CamaroteInferior();
				System.out.println("CAMAROTE INFERIOR");
				ing.ingresso =ticket.ingressoVip();

			}
		
		}
			
		ing.imprimeValor();
		
		////////////////
		System.out.println("DIGITE 1 p/ NOVO e 2 p/ VELHO");
		x = reader.nextInt();
		
		if(x == 1) {
			
			Novo apto = new  Novo();
			apto.valorNovo();
		}
		else {
			Velho apto = new Velho();
			apto.valorVelho();
		}
			
	}

}
