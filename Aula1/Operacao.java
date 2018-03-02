public class Operacao {

	int checarPositivoNegativo(int numeroRecebido) {
		int resposta = 0;
		if (numeroRecebido > 0) {
			resposta = 1;
		}
		return resposta;
	}

	int recebeESoma(int a, int b) {
		int soma = 0;
		int maior = a;
		int menor = b+1;
		if (b > a) {
			maior = b;
			menor = a+1;
		}
		for (int x = menor; x < maior; x++) {
			soma += x;
		}
		return soma;
	}

	int recebeTres(int a, int b, int c) {
		int soma = 0;
		for (int x = b; x <= c; x++) {
			if (x % a == 0) {
				soma += x;
			}
		}
		return soma;
	}

	void transformaHorario(int sec) {
		int hora = 0, segundos = 0, minutos = 0;
		while (sec >= 60) {	 	  	 	      	      	 	     	     	   	    	 	
			sec = sec - 60;
			minutos++;
			if (minutos >= 60) {
				minutos = minutos - 60;
				hora++;
			}
		segundos = sec;
		}
		
		System.out.println(hora+"h"+minutos+"min"+segundos+"s");

	}

}
