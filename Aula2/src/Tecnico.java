public class Tecnico extends Assistente {

	public Tecnico(String nome, int cpf, double salario, int matricula) {
		super(nome, cpf, salario, matricula);
		// TODO Auto-generated constructor stub
	}





	double bonusSalarial=750;

	@Override
	public double calculeSalario() {
		
		if (turno == true) {
			salario += bonusSalarial;
		}
		
		return salario;	
}


	

}
