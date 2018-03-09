
public class Administrativo extends Assistente{

	public Administrativo(String nome, int cpf, double salario, int matricula) {
		super(nome, cpf, salario, matricula);
		// TODO Auto-generated constructor stub
	}



	//Dia = false;
	double adicionalNoturno=1250;



	
	public double calculeSalario() {
		
		if(turno == true) {
			salario += adicionalNoturno;
		}
		
		return salario;
		
		
}

}
