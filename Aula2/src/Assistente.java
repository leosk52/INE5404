
public class Assistente extends Funcionario {

		
	int matricula;
	boolean turno;
	
	public Assistente(String nome, int cpf, double salario, int matricula) {
		super(nome, cpf,  salario);
		this.matricula = matricula;
		// TODO Auto-generated constructor stub
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public void exibeDados() {
		System.out.println("Nome: " + nome + "\n CPF: " 
							+ cpf + "\n Salário: "
							+ salario + "\n Matrícula: "+matricula);
	}
	
	
	public void setTurno(boolean x) {
		this.turno = x;
		
	}
	public boolean getTurno() {
		return turno;
	}
	
	
}
